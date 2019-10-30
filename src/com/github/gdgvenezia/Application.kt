package com.github.gdgvenezia

import com.fasterxml.jackson.databind.SerializationFeature
import com.github.gdgvenezia.meetup.MeetupClientImpl
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.features.*
import io.ktor.jackson.*
import org.slf4j.event.*
import io.ktor.auth.*
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import java.util.*

/**
 * Main
 */
fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    /**
     * Client setup
     * 1. specifying an engine, for example Apache, OkHttp, Android, Ios, Js, Jetty, CIO or Mock
     * 2. configure a Json Serializer
     */
    val httpClient: HttpClient by lazy {
        HttpClient(OkHttp) {
            install(JsonFeature) {
                serializer = JacksonSerializer()
            }

        }
    }

    val meetupClient = MeetupClientImpl(httpClient)

    val repository: Repository = RepositoryImpl(meetupClient)

    install(CallLogging) {
        level = Level.INFO
        filter { call -> call.request.path().startsWith("/") }
    }

    install(Authentication) {
        basic("myBasicAuth") {
            realm = "Ktor Server"
            validate { if (it.name == "test" && it.password == "password") UserIdPrincipal(it.name) else null }
        }
    }

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT) // Pretty Prints the JSON
        }
    }

    routing {
        get("/") {
            call.respondText("HELLO GDG VENEZIA!", contentType = ContentType.Text.Plain)
        }

        authenticate("myBasicAuth") {
            get("/protected/route/basic") {
                val principal = call.principal<UserIdPrincipal>()!!
                call.respondText("Hello ${principal.name}")
            }
        }

        get("/events") {
            val locale = call.request.getAcceptLocale()
            call.respond(repository.getEvents(locale))
        }

        get("/events/future") {
            val locale = call.request.getAcceptLocale()
            call.respond(repository.getFutureEvents(locale))
        }

        get("/events/past") {
            val locale = call.request.getAcceptLocale()
            call.respond(repository.getPastEvents(locale))
        }

        get("/photos") {
            call.respond(repository.getPhotos())
        }

        get("/team") {
            call.respond(repository.getTeam())
        }

        get("/social") {
            call.respond(repository.getSocialLinks())
        }
    }
}

private fun ApplicationRequest.getAcceptLocale(): Locale {
    return when (this.acceptLanguage()) {
        "it" -> Locale.ITALIAN
        else -> Locale.ENGLISH
    }
}


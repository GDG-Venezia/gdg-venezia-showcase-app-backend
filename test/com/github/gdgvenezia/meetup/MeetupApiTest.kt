package com.github.gdgvenezia.meetup

import com.github.gdgvenezia.module
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.http.*
import kotlin.test.*
import io.ktor.server.testing.*
import kotlinx.coroutines.runBlocking

class MeetupApiTest {

    val httpClient: HttpClient by lazy {
        HttpClient(OkHttp) {
            install(JsonFeature) {
                serializer = JacksonSerializer()
            }

        }
    }

    private val client = MeetupClientImpl(httpClient)

    @kotlin.test.Test
    fun callFutureEventsApi() = runBlocking {
        val futureEvents = client.getFutureEvents()
        assertNotNull(futureEvents)
        return@runBlocking
    }

    @kotlin.test.Test
    fun callPastEventsApi() = runBlocking {
        val pasteEvents = client.getPastEvents()
        assertNotNull(pasteEvents)
        return@runBlocking
    }
}

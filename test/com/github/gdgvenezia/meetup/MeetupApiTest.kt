package com.github.gdgvenezia.meetup

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import kotlin.test.*
import kotlinx.coroutines.runBlocking
import java.util.*

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
        val futureEvents = client.getFutureEvents(Locale.ITALIAN)
        assertNotNull(futureEvents)
        return@runBlocking
    }

    @kotlin.test.Test
    fun callPastEventsApi() = runBlocking {
        val pasteEvents = client.getPastEvents(Locale.ITALIAN)
        assertNotNull(pasteEvents)

        val io17 = pasteEvents.find { it.title == "Google I/O Extended Venezia 2017" }
        assertNotNull(io17)
        assertEquals(2017, io17.date.year, "year mismatch")
        assertEquals(17, io17.date.day, "day mismatch")

        return@runBlocking
    }
}

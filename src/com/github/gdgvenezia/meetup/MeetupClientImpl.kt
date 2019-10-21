package com.github.gdgvenezia.meetup

import com.github.gdgvenezia.EventModel
import io.ktor.client.HttpClient
import io.ktor.client.request.get

/**
 * API Console: https://secure.meetup.com/meetup_api/console/?path=/:urlname/events
 */
class MeetupClientImpl(private val httpClient: HttpClient): MeetupClient {

    private val mapper = MeetupResponseMapper()

    override suspend fun getFutureEvents(): List<EventModel> {
        val url = "https://api.meetup.com/GDG-Venezia/events?&sign=true&photo-host=public&page=100&status=upcoming"

        return callEventApi(url)
    }

    override suspend fun getPastEvents(): List<EventModel> {
        val url = "https://api.meetup.com/GDG-Venezia/events?&sign=true&photo-host=public&page=100&status=past"

        return callEventApi(url)
    }

    private suspend fun callEventApi(url: String): List<EventModel> {
        val items = httpClient.get<List<HashMap<String, MeetupEventItemResponse>>>(url)

        return items.flatMap { it.values.map { mapper.map(it) } }
    }


}

data class MeetupEventItemResponse(
    val name: String,
    val local_date: String,
    val local_time: String,
    val utc_offset: Long,
    val venue: MeetupEventVenueResponse,
    val link: String,
    val description: String // html description
)

data class MeetupEventVenueResponse(
    val name: String,
    val lat: Double,
    val lon: Double,
    val address_1: String,
    val city: String
)

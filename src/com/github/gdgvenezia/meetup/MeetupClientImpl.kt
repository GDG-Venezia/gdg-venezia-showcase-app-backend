package com.github.gdgvenezia.meetup

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.gdgvenezia.EventModel
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import java.time.Duration

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
        val string = httpClient.get<String>(url)
        println(string)

        val items = httpClient.get<List<MeetupEventItemResponse>>(url)

        return items.map { mapper.map(it) }
    }


}

@JsonIgnoreProperties(ignoreUnknown = true)
data class MeetupEventItemResponse(
    @JsonProperty("id") val id: String,
    @JsonProperty("name") val name: String,
    @JsonProperty("time") val time: Long,
    @JsonProperty("local_date") val localDate: String,
    @JsonProperty("local_time") val localTime: String,
    @JsonProperty("utc_offset") val utcOffset: Long,
    @JsonProperty("venue") val venue: MeetupEventVenueResponse?,
    @JsonProperty("link") val link: String,
    @JsonProperty("description") val description: String, // html description
    @JsonProperty("created") val created: Long,
    @JsonProperty("duration") val duration: Long,
    @JsonProperty("rsvp_limit") val rsvpLimit: Int
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class MeetupEventVenueResponse(
    @JsonProperty("id") val id: Int,
    @JsonProperty("name") val name: String,
    @JsonProperty("lat") val lat: Double,
    @JsonProperty("lon") val lon: Double,
    @JsonProperty("address_1") val address: String?,
    @JsonProperty("city") val city: String
)

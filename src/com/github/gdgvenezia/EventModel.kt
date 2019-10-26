package com.github.gdgvenezia

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class EventModel(
    @JsonProperty("title") val title: String,
    @JsonProperty("local_date_time") val date: LocalDateTime,
    @JsonProperty("time") val time: Long,
    @JsonProperty("utc_offset") val utcOffset: Long,
    @JsonProperty("description") val description: String,
    @JsonProperty("venue") val venue: EventVenueModel?
)

data class EventVenueModel(
    @JsonProperty("name") val name: String,
    @JsonProperty("address") val address: String,
    @JsonProperty("latitude") val latitude: Double,
    @JsonProperty("longitude") val longitude: Double

)
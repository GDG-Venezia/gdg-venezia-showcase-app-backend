package com.github.gdgvenezia

import com.fasterxml.jackson.annotation.JsonProperty

data class EventModel(
    @JsonProperty("title") val title: String,
    //@JsonProperty("local_date_time") val date: LocalDateTime,
    @JsonProperty("time") val time: Long,
    @JsonProperty("utc_offset") val utcOffset: Long,
    @JsonProperty("date") val date: EventDateModel,
    @JsonProperty("description") val description: String,
    @JsonProperty("venue") val venue: EventVenueModel?
)

data class EventDateModel(
    @JsonProperty("day") val day: Int,
    @JsonProperty("day_of_week") val dayOfWeek: String,
    @JsonProperty("month_short") val monthShort: String,
    @JsonProperty("month_full") val monthFull: String,
    @JsonProperty("year") val year: Int
)

data class EventVenueModel(
    @JsonProperty("name") val name: String,
    @JsonProperty("address") val address: String,
    @JsonProperty("latitude") val latitude: Double,
    @JsonProperty("longitude") val longitude: Double

)
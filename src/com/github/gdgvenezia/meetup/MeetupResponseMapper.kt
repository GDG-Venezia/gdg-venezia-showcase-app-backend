package com.github.gdgvenezia.meetup

import com.github.gdgvenezia.EventModel
import com.github.gdgvenezia.EventVenueModel
import java.time.LocalDateTime
import java.time.ZoneOffset

class MeetupResponseMapper: Mapper<MeetupEventItemResponse, EventModel> {
    override fun map(t: MeetupEventItemResponse): EventModel {

        val venue: EventVenueModel? = t.venue?.let {
            EventVenueModel(
                name = it.name,
                address = it.address ?: "",
                latitude = it.lat,
                longitude = it.lon
            )
        }

        return EventModel(
            title = t.name,
            date = LocalDateTime.ofEpochSecond(t.time + t.utcOffset, 0, ZoneOffset.UTC),
            time = t.time,
            utcOffset = t.utcOffset,
            description = t.description,
            venue = venue
        )
    }
}
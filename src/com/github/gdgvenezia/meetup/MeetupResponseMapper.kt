package com.github.gdgvenezia.meetup

import com.github.gdgvenezia.EventModel
import java.time.LocalDateTime
import java.time.ZoneOffset

class MeetupResponseMapper: Mapper<MeetupEventItemResponse, EventModel> {
    override fun map(t: MeetupEventItemResponse): EventModel {
        return EventModel(
            title = t.name,
            date = LocalDateTime.ofEpochSecond(t.time + t.utcOffset, 0, ZoneOffset.UTC)
        )
    }
}
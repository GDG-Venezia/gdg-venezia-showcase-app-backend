package com.github.gdgvenezia.meetup

import com.github.gdgvenezia.EventDateModel
import com.github.gdgvenezia.EventModel
import com.github.gdgvenezia.EventVenueModel
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.TextStyle
import java.util.*

class MeetupResponseMapper(private val locale: Locale): Mapper<MeetupEventItemResponse, EventModel> {

    private val dayFormatter = SimpleDateFormat("d", locale)
    private val dayOfWeekFormatter = SimpleDateFormat("EEE", locale)
    private val monthFullFormatter = SimpleDateFormat("MMMM", locale)
    private val monthShotFormatter = SimpleDateFormat("MMM", locale)
    private val yearFormatter = SimpleDateFormat("yyyy", locale)

    override fun map(t: MeetupEventItemResponse): EventModel {

        val venue: EventVenueModel? = t.venue?.let {
            EventVenueModel(
                name = it.name,
                address = it.address ?: "",
                latitude = it.lat,
                longitude = it.lon
            )
        }

        val dateTime = LocalDateTime.ofEpochSecond((t.time + t.utcOffset)/1000, 0, ZoneOffset.UTC)

        val date = EventDateModel(
            day = dateTime.dayOfMonth,
            dayOfWeek = dateTime.dayOfWeek.getDisplayName(TextStyle.FULL, locale),
            monthFull = dateTime.month.getDisplayName(TextStyle.FULL, locale),
            monthShort = dateTime.month.getDisplayName(TextStyle.SHORT, locale),
            year = dateTime.year
        )

        return EventModel(
            title = t.name,
            //date = LocalDateTime.ofEpochSecond(t.time + t.utcOffset, 0, ZoneOffset.UTC),
            time = t.time,
            utcOffset = t.utcOffset,
            description = t.description,
            venue = venue,
            date = date
        )
    }
}
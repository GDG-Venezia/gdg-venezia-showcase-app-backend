package com.github.gdgvenezia.meetup

import com.github.gdgvenezia.EventModel
import java.util.*

interface MeetupClient {

    suspend fun getFutureEvents(locale: Locale): List<EventModel>
    suspend fun getPastEvents(locale: Locale): List<EventModel>
}
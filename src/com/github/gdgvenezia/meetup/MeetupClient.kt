package com.github.gdgvenezia.meetup

import com.github.gdgvenezia.EventModel

interface MeetupClient {

    suspend fun getFutureEvents(): List<EventModel>
    suspend fun getPastEvents(): List<EventModel>
}
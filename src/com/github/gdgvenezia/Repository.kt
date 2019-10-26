package com.github.gdgvenezia

import java.util.*

interface Repository {
    suspend fun getEvents(locale: Locale): ListResponseModel<EventModel>
    suspend fun getFutureEvents(locale: Locale): ListResponseModel<EventModel>
    suspend fun getPastEvents(locale: Locale): ListResponseModel<EventModel>
    fun getPhotos(): ListResponseModel<PhotoModel>
    fun getTeam(): ListResponseModel<TeamMemberModel>
    fun getSocialLinks(): ListResponseModel<SocialLinkModel>

}

data class ListResponseModel<T>(
    val items: List<T>
)
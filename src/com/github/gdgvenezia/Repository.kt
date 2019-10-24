package com.github.gdgvenezia

interface Repository {
    suspend fun getEvents(): List<EventModel>
    fun getPhotos(): ListResponseModel<PhotoModel>
    fun getTeam(): List<TeamMemberModel>
    fun getSocialLinks(): List<SocialLinkModel>

}

data class ListResponseModel<T>(
    val items: List<T>
)
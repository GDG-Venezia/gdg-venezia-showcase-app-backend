package com.github.gdgvenezia

interface Repository {
    suspend fun getEvents(): ListResponseModel<EventModel>
    fun getPhotos(): ListResponseModel<PhotoModel>
    fun getTeam(): ListResponseModel<TeamMemberModel>
    fun getSocialLinks(): ListResponseModel<SocialLinkModel>

}

data class ListResponseModel<T>(
    val items: List<T>
)
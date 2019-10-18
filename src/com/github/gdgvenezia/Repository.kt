package com.github.gdgvenezia

interface Repository {
    fun getEvents(): List<EventModel>
    fun getPhotos(): List<PhotoModel>
    fun getTeam(): List<TeamMemberModel>
    fun getSocialLinks(): List<SocialLinkModel>

}

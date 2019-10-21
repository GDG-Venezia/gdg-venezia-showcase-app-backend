package com.github.gdgvenezia.meetup

interface Mapper<in T, R> {
    fun map(t: T): R
}

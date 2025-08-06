package com.kyubae.torikizokutracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
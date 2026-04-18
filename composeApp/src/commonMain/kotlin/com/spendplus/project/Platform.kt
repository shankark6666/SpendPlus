package com.spendplus.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
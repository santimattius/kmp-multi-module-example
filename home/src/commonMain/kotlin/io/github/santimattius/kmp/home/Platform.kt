package io.github.santimattius.kmp.home

internal interface Platform {
    val name: String
}

internal expect fun getPlatform(): Platform
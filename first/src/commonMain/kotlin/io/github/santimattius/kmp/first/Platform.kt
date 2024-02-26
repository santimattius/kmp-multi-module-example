package io.github.santimattius.kmp.first

internal interface Platform {
    val name: String
}

internal expect fun getPlatform(): Platform
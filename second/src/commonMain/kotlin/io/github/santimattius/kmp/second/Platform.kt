package io.github.santimattius.kmp.second

internal interface Platform {
    val name: String
}

internal expect fun getPlatform(): Platform
package io.github.santimattius.kmp.checkout

internal interface Platform {
    val name: String
}

internal expect fun getPlatform(): Platform
package io.github.santimattius.kmp.checkout

import io.github.santimattius.kmp.data.UUIDCreator

class SecondGreeting {
    private val platform: Platform = getPlatform()
    private val creator = UUIDCreator()

    fun greet(): String {
        return "Hello, ${platform.name}! (${creator.create()})"
    }
}
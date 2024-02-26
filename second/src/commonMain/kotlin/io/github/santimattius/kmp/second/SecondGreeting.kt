package io.github.santimattius.kmp.second

import io.github.santimattius.kmp.core.UUIDCreator

class SecondGreeting {
    private val platform: Platform = getPlatform()
    private val creator = UUIDCreator()

    fun greet(): String {
        return "Hello, ${platform.name}! (${creator.create()})"
    }
}
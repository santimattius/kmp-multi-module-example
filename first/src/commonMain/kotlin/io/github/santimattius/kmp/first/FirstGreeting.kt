package io.github.santimattius.kmp.first

import io.github.santimattius.kmp.core.UUIDCreator

class FirstGreeting {
    private val platform: Platform = getPlatform()
    private val creator = UUIDCreator()

    fun greet(): String {
        return "Hello, ${platform.name}! (${creator.create()})"
    }
}
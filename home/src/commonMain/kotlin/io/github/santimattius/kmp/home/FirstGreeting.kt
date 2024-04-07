package io.github.santimattius.kmp.home

import io.github.santimattius.kmp.data.UUIDCreator

class FirstGreeting {
    private val platform: Platform = getPlatform()
    private val creator = UUIDCreator()

    fun greet(): String {
        return "Hello, ${platform.name}! (${creator.create()})"
    }
}
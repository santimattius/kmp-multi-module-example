package io.github.santimattius.kmp.data

import platform.Foundation.NSUUID

actual fun randomUUID(): String {
    return NSUUID().UUIDString()
}
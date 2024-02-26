package io.github.santimattius.kmp.core

import java.util.UUID

actual fun randomUUID(): String {
  return UUID.randomUUID().toString()
}
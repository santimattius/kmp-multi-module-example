package io.github.santimattius.kmp.home

import io.github.santimattius.kmp.data.BookRepository

class GetAll(private val repository: BookRepository) {

    operator fun invoke() = repository.getAll()
}
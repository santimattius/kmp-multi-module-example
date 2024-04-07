package io.github.santimattius.kmp.checkout

import io.github.santimattius.kmp.data.Book
import io.github.santimattius.kmp.data.BookRepository

class ProcessCheckout(private val repository: BookRepository) {

    operator fun invoke(book: Book) {
        // generate checkout action
    }
}
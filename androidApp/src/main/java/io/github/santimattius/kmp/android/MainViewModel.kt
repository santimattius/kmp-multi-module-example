package io.github.santimattius.kmp.android

import io.github.santimattius.kmp.data.Book
import io.github.santimattius.kmp.data.BookRepository
import io.github.santimattius.kmp.checkout.ProcessCheckout
import io.github.santimattius.kmp.home.GetAll

class MainViewModel {
    private val repository = BookRepository()
    private val processCheckout = ProcessCheckout(repository)
    private val getAll = GetAll(repository)

    fun checkout() {
        val books = getAll.invoke()
        val book: Book = books.first()

        processCheckout.invoke(book)
    }
}
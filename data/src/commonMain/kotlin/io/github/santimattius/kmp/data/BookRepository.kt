package io.github.santimattius.kmp.data

class BookRepository {

    private val books = mutableMapOf<String, Book>()

    fun findById(id: String): Book? {
        return books[id]
    }

    fun getAll(): List<Book> {
        return books.values.toList()
    }
}
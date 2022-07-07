package com.saintrivers.demokotlin.service

import com.saintrivers.demokotlin.model.BookRequest
import com.saintrivers.demokotlin.model.BookResponse

interface BookService {

    fun findAllBooks(): List<BookResponse>

    fun findById(id: Int): BookResponse?

    fun addBook(bookRequest: BookRequest): BookResponse

    fun removeBook(id: Int)
}
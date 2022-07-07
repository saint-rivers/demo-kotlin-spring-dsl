package com.saintrivers.demokotlin.controller

import com.saintrivers.demokotlin.model.BookEntity
import com.saintrivers.demokotlin.model.BookRequest
import com.saintrivers.demokotlin.model.BookResponse
import com.saintrivers.demokotlin.service.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/books")
class BookController(val bookService: BookService) {

    @GetMapping
    fun getAllBooks(): List<BookResponse> = bookService.findAllBooks()

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: Int): BookResponse = bookService
        .findById(id) ?: BookResponse(1, "", "", "", 0.0)

    @PostMapping
    fun createBook(@RequestBody bookRequest: BookRequest): BookResponse = bookService.addBook(bookRequest)

}
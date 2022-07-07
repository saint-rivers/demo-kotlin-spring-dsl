package com.saintrivers.demokotlin.service

import com.saintrivers.demokotlin.repository.BookRepository
import com.saintrivers.demokotlin.mapper.toEntity
import com.saintrivers.demokotlin.mapper.toResponse
import com.saintrivers.demokotlin.model.BookRequest
import com.saintrivers.demokotlin.model.BookResponse
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(val bookRepository: BookRepository) : BookService {


    override fun findAllBooks(): List<BookResponse> = bookRepository.findAll()
        .stream()
        .filter {
            it.description != null
        }.map {
            it.toResponse()
        }.toList()


    override fun findById(id: Int): BookResponse? {
        TODO("Not yet implemented")
    }

    override fun addBook(bookRequest: BookRequest): BookResponse = bookRepository
        .save(bookRequest.toEntity()).toResponse()

    override fun removeBook(id: Int) {
        TODO("Not yet implemented")
    }

}
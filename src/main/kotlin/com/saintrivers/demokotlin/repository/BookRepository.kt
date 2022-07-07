package com.saintrivers.demokotlin.repository

import com.saintrivers.demokotlin.model.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookEntity, Int>{

    fun findBookEntityByAuthor(authorName: String): BookEntity
}
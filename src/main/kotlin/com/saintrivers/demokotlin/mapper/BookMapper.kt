package com.saintrivers.demokotlin.mapper

import com.saintrivers.demokotlin.model.BookEntity
import com.saintrivers.demokotlin.model.BookRequest
import com.saintrivers.demokotlin.model.BookResponse

fun BookEntity.toResponse(): BookResponse = BookResponse(
    id = id ?: 0,
    title = title,
    author = author,
    description = description?.trim(),
    price = price,
)

fun BookRequest.toEntity(): BookEntity = BookEntity(
    id = null,
    title = title,
    author = author,
    description = description?.trim(),
    price = price,
)
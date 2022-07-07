package com.saintrivers.demokotlin.model

// primary constructor

data class BookResponse(
    var id: Int,
    var title: String,
    var author: String,
    var description: String?,
    var price: Double
)
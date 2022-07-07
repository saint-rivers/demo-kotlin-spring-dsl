package com.saintrivers.demokotlin.model

// primary constructor

data class BookRequest(
    var title: String,
    var author: String,
    var description: String?,
    var price: Double
)

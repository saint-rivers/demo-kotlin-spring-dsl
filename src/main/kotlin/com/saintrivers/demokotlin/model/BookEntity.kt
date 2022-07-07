package com.saintrivers.demokotlin.model

import org.hibernate.Hibernate
import javax.persistence.*

// primary constructor

@Table
@Entity
data class BookEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Int?,
    var title: String,
    var author: String,
    var description: String?,
    var price: Double
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as BookEntity

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , title = $title , author = $author , description = $description , price = $price )"
    }
}

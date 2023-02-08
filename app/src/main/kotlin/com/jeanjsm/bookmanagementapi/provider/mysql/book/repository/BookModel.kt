package com.jeanjsm.bookmanagementapi.provider.mysql.book.repository

import com.jeanjsm.bookmanagementapi.entities.BookEntity
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate

@Entity
@Table(name = "book")
data class BookModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val title: String,
    val number: Int,
    val author: String,
    @CreationTimestamp
    val createdAt: LocalDateTime = LocalDateTime.now(),
    @UpdateTimestamp
    val updatedAt: LocalDateTime = LocalDateTime.now()
)

fun BookEntity.toModel() : BookModel =
    BookModel(
        id = this.id,
        title = this.title,
        number = this.number,
        author = this.author,
        createdAt = this.createdAt,
        updatedAt = this.updatedAt
    )

fun BookModel.toEntity() : BookEntity =
    BookEntity(
        id = this.id,
        title = this.title,
        number = this.number,
        author = this.author,
        createdAt = this.createdAt,
        updatedAt = this.updatedAt
    )

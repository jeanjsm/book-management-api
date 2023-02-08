package com.jeanjsm.bookmanagementapi.entities

import java.time.LocalDateTime

data class BookEntity(
    val id: Long?,
    val title: String,
    val number: Int,
    val author: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)

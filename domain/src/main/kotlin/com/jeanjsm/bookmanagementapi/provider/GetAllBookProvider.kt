package com.jeanjsm.bookmanagementapi.provider

import com.jeanjsm.bookmanagementapi.entities.BookEntity

interface GetAllBookProvider {

    fun get(title: String?, page: Int, size: Int, sortBy: String, sort: String) : List<BookEntity>

}
package com.jeanjsm.bookmanagementapi.usecase.importer

import com.jeanjsm.bookmanagementapi.entities.BookEntity
import com.jeanjsm.bookmanagementapi.usecase.book.CreateBookUseCase
import jakarta.inject.Named

@Named
class ImporterUseCase(
    private val searchDataComicUseCase: SearchDataComicUseCase,
    private val createBookUseCase: CreateBookUseCase
) {

    fun execute(isbn: String, volumeNumber: Int): BookEntity {
        val response = searchDataComicUseCase.searchIsbnSkoob(isbn)
        return createBookUseCase.exec(BookEntity(
            code = response.first().id,
            title = response.first().title,
            number = volumeNumber,
            author = "",
            coverUrl = response.first().coverUrl
        ))
    }

}
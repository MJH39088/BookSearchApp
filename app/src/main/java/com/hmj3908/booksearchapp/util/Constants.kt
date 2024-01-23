package com.hmj3908.booksearchapp.util

import com.hmj3908.booksearchapp.BuildConfig


object Constants {
    const val BASE_URL = "https://dapi.kakao.com/"
    const val API_KEY = BuildConfig.bookApikey
    const val SEARCH_BOOKS_TIME_DELAY = 100L
    const val DATASTORE_NAME = "preferences_datastore"
    const val PAGING_SIZE = 15
}
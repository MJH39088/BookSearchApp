package com.hmj3908.booksearchapp.data.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.hmj3908.booksearchapp.data.api.BookSearchApi
//import com.hmj3908.booksearchapp.data.api.RetrofitInstance.api
import com.hmj3908.booksearchapp.data.model.Book
import com.hmj3908.booksearchapp.util.Constants.PAGING_SIZE
import retrofit2.HttpException
import java.io.IOException

class BookSearchPagingSource(
    private val api: BookSearchApi,
    private val query: String,
    private val sort: String
) : PagingSource<Int, Book>() {
    override fun getRefreshKey(state: PagingState<Int, Book>): Int? {
        return state.anchorPosition?.let { anchorPositon ->
            state.closestPageToPosition(anchorPositon)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPositon)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Book> {
        return try {
            val pageNumber = params.key ?: STARTING_PAGING_INDEX
            val response = api.searchBooks(query, sort, pageNumber, params.loadSize)
            val endOfPaginationReached = response.body()?.meta?.isEnd!!

            val data = response.body()?.documents!!
            val prevKey = if (pageNumber == STARTING_PAGING_INDEX) null else pageNumber - 1
            val nextKey = if (endOfPaginationReached) {
                null
            } else {
                pageNumber + (params.loadSize / PAGING_SIZE)
            }
            LoadResult.Page(
                data = data,
                prevKey = prevKey,
                nextKey = nextKey
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }

    companion object {
        const val STARTING_PAGING_INDEX = 1
    }
}
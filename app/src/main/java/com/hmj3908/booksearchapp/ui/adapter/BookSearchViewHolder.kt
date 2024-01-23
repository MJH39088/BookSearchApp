package com.hmj3908.booksearchapp.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.hmj3908.booksearchapp.data.model.Book
import com.hmj3908.booksearchapp.databinding.ItemBookPreviewBinding

class BookSearchViewHolder(
    private val binding: ItemBookPreviewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(book: Book) {
        val author: String = book.authors.toString().removeSurrounding("[", "]")
        val publisher: String = book.publisher
        val date: String = if (book.datetime.isNotEmpty()) book.datetime.substring(0, 10) else ""

        itemView.apply {
            binding.ivArticleImage.load(book.thumbnail)
            binding.tvTitle.text = book.title
            binding.tvAuthor.text = "$author | $publisher"
            binding.tvDatetime.text = date
        }
    }
}
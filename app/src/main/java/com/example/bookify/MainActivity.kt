package com.example.bookify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bookify.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    val activity = this
    val list:ArrayList<BooksModel> = ArrayList()
    val adapter = BooksAdapter(list,activity)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.apply {
          mRecyclerViewHome.adapter = adapter
          list.add(BooksModel(R.drawable.book_1,"Book_Title","Book_Description","sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_2,"Book_Title","Book_Description","sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_3,"Book_Title","Book_Description","sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_4,"Book_Title","Book_Description","sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_5,"Book_Title","Book_Description","sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_1,"Rich Dad Poor Dad",getString(R.string.description_1),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_2,"Atomic Habits",getString(R.string.description_2),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_3,"Best Self",getString(R.string.description_3),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_4,"How To BeFine",getString(R.string.description_4),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_5,"Out of theBox",getString(R.string.description_5),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_6,"Stripped",getString(R.string.description_6),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_7,"12 Rules forLife",getString(R.string.description_7),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_8,"Readistan",getString(R.string.description_8),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_9,"Reclaim Your Heart",getString(R.string.description_9),"sample_book.pdf"))
          list.add(BooksModel(R.drawable.book_10,"Lost Islamic History",getString(R.string.description_10),"sample_book.pdf"))
      }


    }
}
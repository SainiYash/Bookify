package com.example.bookify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.bookify.databinding.ActivityPdfBinding

class PdfActivity : AppCompatActivity() {

    val activity = this
    lateinit var binding : ActivityPdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfBinding.inflate(layoutInflater)
        this.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.apply {
            val bookPdf = intent.getStringExtra("book_pdf").toString()

            pdfView.fromAsset(bookPdf)
                .swipeHorizontal(true)
                .enableSwipe(true)
                .swipeHorizontal(true)
                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .load()

        }

    }
}
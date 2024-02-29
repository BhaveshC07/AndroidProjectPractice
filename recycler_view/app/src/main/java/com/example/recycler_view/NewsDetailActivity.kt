package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        val heading=intent.getStringExtra("heading")
        val newsContentt=intent.getStringExtra("newscontent")
        val imageId=intent.getIntExtra("imageId",R.drawable.img1)

        val headingtv=findViewById<TextView>(R.id.newsHeading)
        val headingiv=findViewById<ImageView>(R.id.newsImage)
        val headingcv=findViewById<TextView>(R.id.newsContent)

        headingtv.text=heading
        headingcv.text=newsContentt
        headingiv.setImageResource(imageId)
    }
}
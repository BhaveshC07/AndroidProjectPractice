package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout=findViewById<LinearLayout>(R.id.linearLayout)
        layout.setBackgroundResource(R.color.purple)

        val letsGo =findViewById<Button>(R.id.butLetsGo)

        letsGo.setOnClickListener{
            intent= Intent(applicationContext,page2::class.java)
            startActivity(intent)
        }
    }
}
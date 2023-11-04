package com.example.interactiveapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butDark=findViewById<Button>(R.id.butDark)
        val butRead=findViewById<Button>(R.id.butread)
        val layout=findViewById<LinearLayout>(R.id.linearLayout)
        butRead.setOnClickListener{
            //change theme to light
            layout.setBackgroundResource(R.color.yellow)
        }

        butDark.setOnClickListener{
            //change theme to light
            layout.setBackgroundResource(R.color.black)
        }
    }
}
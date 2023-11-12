package com.example.multiscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.butorder
//import kotlinx.android.synthetic.main.activity_main.editTextText
import kotlinx.android.synthetic.main.activity_main.et1
import kotlinx.android.synthetic.main.activity_main.et2
import kotlinx.android.synthetic.main.activity_main.et3
import kotlinx.android.synthetic.main.activity_main.et4

class MainActivity : AppCompatActivity() {

    companion object{
        const val keY="com.example.multiscreen.MainActivity.keY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butorder.setOnClickListener{
            val orderPlaced = et1.text.toString()+" " +et2.text.toString()+" "+et3.text.toString()+" "+et4.text.toString()
            intent= Intent(this,showOrder::class.java)
            intent.putExtra(keY,orderPlaced)
            startActivity(intent)
        }

    }
}
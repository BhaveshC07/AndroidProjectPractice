package com.example.multiscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_order.tvOrder

class showOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_order)

        val orderofCustomer=intent.getStringExtra(MainActivity.keY)

        tvOrder.text=orderofCustomer.toString()
    }
}
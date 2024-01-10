package com.example.newdialogbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //create a variable of type dialog

    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn=findViewById<Button>(R.id.btnclick)

        dialog=Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        var btngood=dialog.findViewById<Button>(R.id.good)
        var btnfeed=dialog.findViewById<Button>(R.id.feedback)

        btngood.setOnClickListener {
            dialog.dismiss()
        }

        btnfeed.setOnClickListener {

            Toast.makeText(this,"feedback send", Toast.LENGTH_SHORT).show()
        }
        btn.setOnClickListener {
            dialog.show()
        }

    }
}
package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val layout1=findViewById<LinearLayout>(R.id.LinearLayout1)
        val call=findViewById<CardView>(R.id.btnCall)
        val android=findViewById<CardView>(R.id.btnAndroidDev)
        val ios=findViewById<CardView>(R.id.btnIOSdev)
        val blockchain=findViewById<CardView>(R.id.btnBlock)
        val webD=findViewById<CardView>(R.id.btnWEBd)
        val machine=findViewById<CardView>(R.id.btnML)


        layout1.setBackgroundResource(R.color.purple)

        call.setOnClickListener{
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:7558756068")
            startActivity(intent)
        }

        android.setOnClickListener{
            intent= Intent(applicationContext,appDev::class.java)
            startActivity(intent)
        }

        ios.setOnClickListener{
            intent=Intent(applicationContext,iosDev::class.java)
            startActivity(intent)
        }

        blockchain.setOnClickListener{
            intent=Intent(applicationContext,blockchain1::class.java)
            startActivity(intent)
        }

        webD.setOnClickListener{
            intent =Intent(applicationContext,webDev::class.java)
            startActivity(intent)
        }

        machine.setOnClickListener{
            intent =Intent(applicationContext,machinLearning::class.java)
            startActivity(intent)
        }
    }
}
package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val WebBtn=findViewById<CardView>(R.id.cardWebsite)
        val Cambtn=findViewById<CardView>(R.id.cardCamera)
        val Mapbtn=findViewById<CardView>(R.id.cardMap)
        val Callbtn=findViewById<CardView>(R.id.cardcall)
        WebBtn.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.com/")
            startActivity(intent)
        }

        Cambtn.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        // Map point based on address
        Mapbtn.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("geo:21.27657904476244, 78.58760504134715")
            startActivity(intent)
        }

        Callbtn.setOnClickListener{

            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("tel:7558756068")
            startActivity(intent)
        }
    }

}
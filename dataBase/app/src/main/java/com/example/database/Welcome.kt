package com.example.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val name=intent.getStringExtra(SignInActivity.KEY1)
        val mail=intent.getStringExtra(SignInActivity.KEY)
        val userId=intent.getStringExtra(SignInActivity.KEY2)
        val mailText=findViewById<TextView>(R.id.btnMail)
        val UserNameText=findViewById<TextView>(R.id.btmuserName)
        val welcomeText=findViewById<TextView>(R.id.tvWelcome)
        welcomeText.text= "Welcome$name"
        mailText.text= "Welcome$mail"
        UserNameText.text= "Welcome$userId"
    }
}
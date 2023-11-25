package com.example.database

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
//link database == https://console.firebase.google.com/u/0/project/database-9d06f/database/database-9d06f-default-rtdb/data
class MainActivity : AppCompatActivity() {

    lateinit var database:DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
0
        val signupbtn=findViewById<Button>(R.id.btnSignUp)
        val etName=findViewById<EditText>(R.id.etName)
        val etMail=findViewById<EditText>(R.id.etMail)
        val etUserName=findViewById<EditText>(R.id.etUserName)
        val etPassword=findViewById<EditText>(R.id.etPass)
        val signinbtn1=findViewById<Button>(R.id.btnSignIn1)
        signupbtn.setOnClickListener{
            val name=etName.text.toString()
            val mail=etMail.text.toString()
            val usern=etUserName.text.toString()
            val password=etPassword.text.toString()

            val user=User(name,mail,usern,password)
            database=FirebaseDatabase.getInstance().getReference("Users")
            database.child(usern).setValue(user).addOnSuccessListener {
                etName.text?.clear()
                etMail.text?.clear()
                etUserName.text?.clear()
                etPassword.text?.clear()

                Toast.makeText(this,"User Register",Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }
        }
        signinbtn1.setOnClickListener{
            val intent1= Intent(this,SignInActivity::class.java)
            startActivity(intent1)
        }
    }
}
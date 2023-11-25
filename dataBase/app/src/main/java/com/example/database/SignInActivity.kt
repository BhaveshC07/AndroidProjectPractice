package com.example.database

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignInActivity : AppCompatActivity() {

    private lateinit var databaseReference: DatabaseReference
    companion object{
        const val KEY="com.example.database.SignInActivity.mail"
        const val KEY1="com.example.database.SignInActivity.name"
        const val KEY2="com.example.database.SignInActivity.id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signInbtn=findViewById<Button>(R.id.btnSignIn)
        val username=findViewById<TextInputEditText>(R.id.etUserName1)
        val signUp1=findViewById<Button>(R.id.btnSignUp1)
        signInbtn.setOnClickListener{
            val usernameString=username.text.toString()
            if(usernameString.isNotEmpty()){
                readData(usernameString)
            }else{
                Toast.makeText(this,"please enter  user name",Toast.LENGTH_SHORT).show()
            }
        }
        signUp1.setOnClickListener{
            val intent2=Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }
    }

  private fun readData(usernameString: String) {
        databaseReference=FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(usernameString).get().addOnSuccessListener {
            if(it.exists()){
                //open welcome user with intent and also pass
                val email=it.child("email").value
                val name=it.child("name").value
                val userName=it.child("userName").value

                val newIntent=Intent(this,Welcome::class.java)
                newIntent.putExtra(KEY,email.toString())
                newIntent.putExtra(KEY1,name.toString())
                newIntent.putExtra(KEY2,userName.toString())
                startActivity(newIntent)
            }else{
                Toast.makeText(this,"User does not Exist",Toast.LENGTH_SHORT).show()
            }

      }.addOnFailureListener{
          Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
        }
    }
}
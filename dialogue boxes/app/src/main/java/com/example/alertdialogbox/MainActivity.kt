package com.example.alertdialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            val builder1=AlertDialog.Builder(this)
            builder1.setTitle("Are you sure!!")
            builder1.setMessage("Do you want to close the app?")
//            builder1.setIcon(R.drawable.baseline_arrow_back_24)
            builder1.setPositiveButton("OK",DialogInterface.OnClickListener{DialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("Cancel", DialogInterface.OnClickListener{DialogInterface, i ->

            } )
            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val option= arrayOf("Gulab Jamun", "Rasmalai", "Laddoo")
            val builder2=AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet")
            builder2.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"You clickes on ${option[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener{DialogInterface, i ->

            })
            builder2.setNegativeButton("Cancel", DialogInterface.OnClickListener{DialogInterface, i ->

            } )
            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val option= arrayOf("Gulab Jamun", "Rasmalai", "Laddoo")
            val builder3=AlertDialog.Builder(this)
            builder3.setTitle("Which is your favourite sweet")
            builder3.setMultiChoiceItems(option,null,DialogInterface.OnMultiChoiceClickListener { dialog, which,isChecked ->
                Toast.makeText(this,"You clickes on ${option[which]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener{DialogInterface, i ->

            })
            builder3.setNegativeButton("Cancel", DialogInterface.OnClickListener{DialogInterface, i ->

            } )
            builder3.show()
        }
    }
}
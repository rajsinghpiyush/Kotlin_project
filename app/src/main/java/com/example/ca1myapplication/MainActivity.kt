package com.example.ca1myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var bt1 = findViewById<Button>(R.id.bt1)
        var et2 = findViewById<EditText>(R.id.et2)
        bt1.setOnClickListener{
            Toast.makeText(this,"Booked Successfully for ${et2.text}", Toast.LENGTH_LONG).show()
        }
    }
}
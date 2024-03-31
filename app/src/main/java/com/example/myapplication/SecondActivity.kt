package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent = intent

        var edtPassword = findViewById<EditText>(R.id.pw)
        edtPassword.setText(intent.getStringExtra("password"))

        var txtSignIn = findViewById<TextView>(R.id.end2)
        txtSignIn.setOnClickListener{
            finish()
        }
    }
}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var edtPassword: TextInputEditText
    lateinit var loginbtn: Button
    lateinit var txtSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtPassword = findViewById<TextInputEditText>(R.id.pw)
        var password = ""
        edtPassword.doOnTextChanged { text, start, before, count ->
            password = text.toString()
        }

        loginbtn = findViewById<Button>(R.id.loginbtn)
        loginbtn.setOnClickListener{
            if (password.equals("123")){
                Toast.makeText(this, "Password is correct", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Password is incorrect", Toast.LENGTH_SHORT).show()
            }
        }

        txtSignUp = findViewById<TextView>(R.id.end2)
        txtSignUp.setOnClickListener{
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("password", password)
            startActivity(intent)
        }
    }
}
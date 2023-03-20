package com.example.latihan3_chapter2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnSignUp = findViewById<Button>(R.id.buttonSignUp)
        btnSignUp.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        val textLogin = findViewById<TextView>(R.id.textLogin2)
        textLogin.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
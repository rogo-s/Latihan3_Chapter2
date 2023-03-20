package com.example.latihan3_chapter2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }

        val textSignUp = findViewById<TextView>(R.id.tvSignUp)
        textSignUp.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}
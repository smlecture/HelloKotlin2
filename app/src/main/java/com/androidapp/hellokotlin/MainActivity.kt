package com.androidapp.hellokotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotln = findViewById<Button>(R.id.btnKotlin)
        btnJava.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }
        btnKotln.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }
    }
}
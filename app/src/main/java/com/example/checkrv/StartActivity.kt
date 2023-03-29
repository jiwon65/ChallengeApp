package com.example.checkrv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        val start = findViewById<ImageView>(R.id.letsstart)
        start.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
    }
}
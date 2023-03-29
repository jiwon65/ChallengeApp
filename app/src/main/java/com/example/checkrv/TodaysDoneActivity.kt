package com.example.checkrv

import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TodaysDoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todays_done)

        val togomain2Activitiy2 = findViewById<ImageView>(R.id.togomainbtn)
        togomain2Activitiy2.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
                startActivity(intent)
            finish()
        }
    }
}
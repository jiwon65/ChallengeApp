package com.example.checkrv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class PlanActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan2)


    val daystextveiw = findViewById<TextView>(R.id.daystv)
    val totalsectextview = findViewById<TextView>(R.id.totalsectv)
    val goaltimetextview = findViewById<TextView>(R.id.goaltimetv)

    val days = intent.getStringExtra("days")
    val totalsec = intent.getStringExtra("totalsec")
    val goaltime  = intent.getStringExtra("goaltime")
    val goaltimedouble = intent.getDoubleExtra("goaltimedouble",0.00)


    daystextveiw.text = days
    totalsectextview.text = totalsec
    goaltimetextview.text = goaltime


    val goback = findViewById<ImageView>(R.id.back)
    goback.setOnClickListener {
        val intentgoback = Intent(this,PlanActivity::class.java)
        startActivity(intentgoback)}

    val gonext = findViewById<ImageView>(R.id.next)
    gonext.setOnClickListener {
        val intentgonext = Intent(this,Main2Activity::class.java)
        startActivity(intentgonext)
        finish()}

    }
}
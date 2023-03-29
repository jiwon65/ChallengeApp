package com.example.checkrv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class PlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan)

        val editTextDate = findViewById<EditText>(R.id.editTextDate)
        val editTextSec = findViewById<EditText>(R.id.editTextSec)

        val next = findViewById<ImageView>(R.id.move)
            next.setOnClickListener {
                    val gonext = Intent(this, PlanActivity2::class.java)
                    // gonext : Intent함수

                    // inputdays, inputtime : 목표일수, 목표시간 & days, time : double형 목표일수, 목표시간
                    // stopwatch : stopwatchactivity에서의 측정값
                    val inputdays: String = editTextDate.getText().toString()
                    val inputtime: String = editTextSec.getText().toString()
                    val days: Int = inputdays.toInt()
                    val time: Double = inputtime.toDouble()
                    val stopwatch = intent.getIntExtra("stopwatch",0)
                    val totalsecdouble = time+stopwatch
                    val totalsecint: Int = totalsecdouble.toInt()


                    val calculatetime : Double = (time + stopwatch) / days
                    val totalgoaltime0 = Math.round(calculatetime * 100) / 100.0
                    val totalgoaltime: String = totalgoaltime0.toString()
                    val totalsec : String =totalsecint.toString()
                    gonext.putExtra("goaltime", totalgoaltime)
                    gonext.putExtra("days", inputdays)
                    gonext.putExtra("totalsec", totalsec)
                    gonext.putExtra("goaltimebouble",totalgoaltime0)

                startActivity(gonext)
        }
    }
}
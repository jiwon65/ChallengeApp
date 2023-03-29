package com.example.checkrv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.example.checkrv.databinding.ActivityFiveBinding
import com.example.checkrv.databinding.ActivityStopWatchBinding
import com.example.checkrv.databinding.ActivityTodaysTimerBinding
import kotlin.concurrent.thread

class TodaysTimerActivity : AppCompatActivity() {

    val binding by lazy { ActivityTodaysTimerBinding.inflate(layoutInflater) }

    var total = 6
    var started = false

    val handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            val minute = String.format("%02d", total / 60)
            val second = String.format("%02d", total % 60)

            binding.textTimer.text = "$minute:$second"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this,TodaysDoneActivity::class.java)

        with(binding) {
            started = true
            thread(start = true) {
                while (started) {
                    Thread.sleep(1000)
                    if (started) {
                        total = total - 1
                        handler?.sendEmptyMessage(0)
                        if(total==0){
                            started = false
                            startActivity(intent)
                            finish()
                        }
                    }
                }
            }
        }
    }
}
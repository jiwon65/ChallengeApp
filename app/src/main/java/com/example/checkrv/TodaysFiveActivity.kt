package com.example.checkrv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.example.checkrv.databinding.ActivityFiveBinding
import com.example.checkrv.databinding.ActivityTodaysFiveBinding
import kotlin.concurrent.thread

class TodaysFiveActivity : AppCompatActivity() {
    val binding by lazy { ActivityTodaysFiveBinding.inflate(layoutInflater) }

    var total = 6
    var started = false

    val handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            val second = String.format("%d",total % 60)

            binding.textTimer.text = "$second"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this,TodaysTimerActivity::class.java)

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
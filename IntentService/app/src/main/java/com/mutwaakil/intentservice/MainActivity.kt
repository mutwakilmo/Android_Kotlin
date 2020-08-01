package com.mutwaakil.intentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                tvText.text = "Service running"
            }
        }

        btnStop.setOnClickListener {
            MyIntentService.stopService()
            tvText.text = "Service Stop"


        }
    }


}
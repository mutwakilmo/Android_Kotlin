package com.mutwaakil.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Log.d("MainActivity", "Hello This my first log messages")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }
}
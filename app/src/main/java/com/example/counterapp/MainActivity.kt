package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.countTxt)
        val btn = findViewById<Button>(R.id.countBtn)
        btn.setOnClickListener {
            count += 1
            text.text = count.toString()
        }
    }
}
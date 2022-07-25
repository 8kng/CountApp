package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ctext = binding.countTxt
        val cbtn = binding.countBtn
        cbtn.setOnClickListener {
            count += 1
            ctext.text = count.toString()
        }
    }
}
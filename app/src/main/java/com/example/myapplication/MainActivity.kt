package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonMinus.setOnClickListener {Log.e("buttonMinus", "MinusIsPressed1" )}
        binding.buttonPlus.setOnClickListener { Log.e("buttonPlus", "PlusIsPressed1") }
        var count = binding.counter.text
        binding.counter.text = "65"
    }
}
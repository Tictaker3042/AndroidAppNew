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
        binding.minus1.setOnClickListener {Log.e("minus1", "MinusIsPressed1" )}
        binding.plus1.setOnClickListener { Log.e("plus1", "PlusIsPressed1") }
        var count = binding.number1.text
        binding.number1.text = "65"
    }
}
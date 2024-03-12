package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var flag = 0
        binding.button3.setOnClickListener {
            if (flag == 0) {
                binding.imageView.setImageResource(R.drawable.pic)
                flag = 1
            }
            else {
                binding.imageView.setImageResource(R.drawable.pic2)
                flag = 0
            }
        }
    }
}
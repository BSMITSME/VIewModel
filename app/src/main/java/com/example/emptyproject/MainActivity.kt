package com.example.emptyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.emptyproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myFactory = ViewModelFactory(100)
        val myViewModel = ViewModelProvider(this, myFactory).get(MyViewModel::class.java)

        binding.textview.text = myViewModel.count.toString()
        binding.button.setOnClickListener{
            myViewModel.count += 1
            binding.textview.text = myViewModel.count.toString()
        }

    }
}
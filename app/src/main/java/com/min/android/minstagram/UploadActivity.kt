package com.min.android.minstagram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.min.android.minstagram.databinding.ActivityMainBinding
import com.min.android.minstagram.databinding.ActivityUploadBinding

class UploadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUploadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityUploadBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

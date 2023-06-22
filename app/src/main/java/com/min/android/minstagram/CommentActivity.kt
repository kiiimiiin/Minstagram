package com.min.android.minstagram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.min.android.minstagram.databinding.ActivityCommentBinding
import com.min.android.minstagram.databinding.ActivityMainBinding
import com.min.android.minstagram.databinding.ActivityUploadBinding

class CommentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCommentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityCommentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

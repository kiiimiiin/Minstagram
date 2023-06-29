package com.min.android.minstagram

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import android.view.KeyEvent.KEYCODE_ENTER
import androidx.activity.OnBackPressedCallback
import androidx.annotation.MainThread
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.min.android.minstagram.databinding.ActivitySearchBinding


class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var keywordList: ArrayList<String>? = getKeywords("keywords")

        binding.searchRvKeyword.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.searchRvKeyword.adapter = keywordList?.let { KeywordAdapter(this, it) }

        binding.searchEtKeyword.setOnKeyListener { v, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KEYCODE_ENTER) {
                keywordList!!.add(binding.searchEtKeyword.text.toString())
                saveKeywords("keywords", keywordList)
                binding.searchRvKeyword.adapter!!.notifyDataSetChanged()
                binding.searchEtKeyword.text = null
            }
            true
        }
        binding.searchIvBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun getKeywords(key: String): ArrayList<String> {
        val prefs = getSharedPreferences("Minstargram", Context.MODE_PRIVATE)
        val json = prefs.getString(key, "[]")
        val gson = Gson()

        return gson.fromJson(
            json,
            object : TypeToken<ArrayList<String?>>() {}.type
        )
    }

    private fun saveKeywords(key: String, values: ArrayList<String>) {
        val gson = Gson()
        val json = gson.toJson(values)
        val prefs = getSharedPreferences("Minstagram", Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.putString(key, json)
        editor.apply()
    }
}


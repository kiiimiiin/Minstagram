package com.min.android.minstagram

import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.min.android.minstagram.databinding.ItemHomeStoryBinding
import com.min.android.minstagram.databinding.ItemSearchRecommendBinding

class RecommendAdapter(private val context: MainActivity, private val dataList: ArrayList<String>) :
    RecyclerView.Adapter<RecommendAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemSearchRecommendBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(context: Context, item: String) {
            Glide.with(context).load(item).into(binding.recommendIv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemSearchRecommendBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(context, dataList[position])
    }
}
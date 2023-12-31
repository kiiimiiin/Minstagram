package com.min.android.minstagram

import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.min.android.minstagram.databinding.ItemHomeStoryBinding

class StoryAdapter(private val context: MainActivity, private val dataList: ArrayList<Story>) :
    RecyclerView.Adapter<StoryAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemHomeStoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(context: Context, item: Story) {
            binding.storyTvUserId.text = item.userId

            Glide.with(context).load(item.profileImageUrl).into(binding.storyIvProfile)
            binding.storyIvProfile.background = ShapeDrawable(OvalShape())
            binding.storyIvProfile.clipToOutline = true

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHomeStoryBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(context, dataList[position])
    }
}
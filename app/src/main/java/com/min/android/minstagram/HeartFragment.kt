package com.min.android.minstagram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.min.android.minstagram.databinding.FragmentHeartBinding
import com.min.android.minstagram.databinding.FragmentMainBinding

class HeartFragment : Fragment() {
    private var _binding: FragmentHeartBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHeartBinding.inflate(inflater, container, false)
       return binding.root
    }
}
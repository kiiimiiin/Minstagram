package com.min.android.minstagram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.min.android.minstagram.databinding.FragmentMainBinding
import com.min.android.minstagram.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    private val imageList: ArrayList<String> = arrayListOf(
        "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202202/08/04305286-7fb3-4e92-aace-c6eeb24ad1f5.jpg",
        "https://img.hankyung.com/photo/202211/BF.31935447.1.jpg",
        "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202202/08/04305286-7fb3-4e92-aace-c6eeb24ad1f5.jpg",
        "https://img.hankyung.com/photo/202211/BF.31935447.1.jpg",
        "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202202/08/04305286-7fb3-4e92-aace-c6eeb24ad1f5.jpg",
        "https://img.hankyung.com/photo/202211/BF.31935447.1.jpg",
        "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202202/08/04305286-7fb3-4e92-aace-c6eeb24ad1f5.jpg",
        "https://img.hankyung.com/photo/202211/BF.31935447.1.jpg",
        "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202202/08/04305286-7fb3-4e92-aace-c6eeb24ad1f5.jpg",
        "https://img.hankyung.com/photo/202211/BF.31935447.1.jpg",
        "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202202/08/04305286-7fb3-4e92-aace-c6eeb24ad1f5.jpg",
        "https://img.hankyung.com/photo/202211/BF.31935447.1.jpg",
        "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202202/08/04305286-7fb3-4e92-aace-c6eeb24ad1f5.jpg",
        "https://img.hankyung.com/photo/202211/BF.31935447.1.jpg",
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.searchRvRecommend.layoutManager = GridLayoutManager(activity, 3)
        binding.searchRvRecommend.adapter = RecommendAdapter(activity as MainActivity, imageList)
    }
}
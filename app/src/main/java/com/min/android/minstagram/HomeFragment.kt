package com.min.android.minstagram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.min.android.minstagram.databinding.FragmentHomeBinding
import com.min.android.minstagram.databinding.FragmentMainBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private var feedList: ArrayList<Feed> = arrayListOf(
        Feed("brille_cercle", "", "", 125155, false, false),
        Feed("kiminki_", "", "", 1, false, false),
        Feed("ssgheejun", "", "", 1, false, false),
        Feed("brille_cercle", "", "", 124424, false, false),
        Feed("brille_cercle", "", "", 345345, false, false),
        Feed("brille_cercle", "", "", 7688866, false, false),
        Feed("brille_cercle", "", "", 567575, false, false),
        Feed("brille_cercle", "", "", 241242, false, false),
        Feed("brille_cercle", "", "", 151252, false, false),
        Feed("brille_cercle", "", "", 346366, false, false),
    )

    private var storyList: ArrayList<Story> = arrayListOf(
        Story("brille_cercle", ""),
        Story("kiminki_", ""),
        Story("ssgheejun", ""),
        Story("brille_cercle", ""),
        Story("kiminki_", ""),
        Story("ssgheejun", ""),
        Story("brille_cercle", ""),
        Story("kiminki_", ""),
        Story("ssgheejun", ""),
        Story("brille_cercle", ""),
        Story("kiminki_", ""),
        Story("ssgheejun", ""),
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeRvFeed.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.homeRvFeed.adapter = FeedAdapter(activity as MainActivity, feedList)
        binding.homeRvFeed.isNestedScrollingEnabled = false

        binding.homeRvStory.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.homeRvStory.adapter = StoryAdapter(activity as MainActivity, storyList)
    }
}
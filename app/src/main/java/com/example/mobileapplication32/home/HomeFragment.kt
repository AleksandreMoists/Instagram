package com.example.mobileapplication32.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobileapplication32.R
import com.example.mobileapplication32.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Set up ViewPager2 with an adapter
        val pages = listOf(
            R.layout.page_1,
            R.layout.page_2
        )
        val adapter = ViewPagerAdapter(pages, requireActivity())
        binding.viewPager.adapter = adapter

        // Attach TabLayout to ViewPager2
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = "Page ${position + 1}" // Optional: Customize tab text
        }.attach()

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}

package com.example.favorites.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.favorites.R
import com.example.favorites.adapter.FavoritActivityPageAdapter
import com.google.android.material.tabs.TabLayout


class FavoriteMainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tableLayoutPagerAdapter =
            FavoritActivityPageAdapter(supportFragmentManager)
        val viewPager = findViewById<ViewPager>(R.id.favoriteViewPager)
        val tableLayout = findViewById<TabLayout>(R.id.favoriteTabLayout)

        if (viewPager != null) {
            viewPager.adapter = tableLayoutPagerAdapter
        }

        if (tableLayout != null) {
            tableLayout.setupWithViewPager(viewPager)
        }


    }



}



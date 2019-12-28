package com.example.favorites.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.favorites.ui.fragments.FavoriteAlbumsFragment
import com.example.favorites.ui.fragments.FavoriteArtistsFragment
import com.example.favorites.ui.fragments.FavoritePlaylistsFragment
import com.example.favorites.ui.fragments.FavoriteTracksFragment


class FavoritActivityPageAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val TAB_ITEMS_COUNT = 4
    private val tab = arrayOf("Artists", "Tracks", "Albums", "Playlists")

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FavoriteArtistsFragment.getInstance()
            }
            1 -> {
                FavoriteTracksFragment.getInstance()
            }
            2 -> {
                FavoriteAlbumsFragment.getInstance()
            }
            else -> {
                FavoritePlaylistsFragment.getInstance()
            }
        }
    }

    override fun getCount(): Int {
        return TAB_ITEMS_COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tab[position]
    }

}






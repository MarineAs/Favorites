package com.example.favorites.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.favorites.R

class FavoritePlaylistsFragment : Fragment() {
    companion object {
        fun getInstance(): FavoritePlaylistsFragment {
            return FavoritePlaylistsFragment()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite_playlists_page_viewer, container, false)
        Log.d("ddd","playlist")
        return view
    }

}
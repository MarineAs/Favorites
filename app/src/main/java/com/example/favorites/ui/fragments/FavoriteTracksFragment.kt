package com.example.favorites.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.favorites.R

class FavoriteTracksFragment : Fragment() {

    companion object {
        fun getInstance(): FavoriteTracksFragment {
            return FavoriteTracksFragment()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite_tracks_page_viewer, container, false)

        return view
    }


}
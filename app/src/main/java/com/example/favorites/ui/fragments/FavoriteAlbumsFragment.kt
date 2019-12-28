package com.example.favorites.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.favorites.R

class FavoriteAlbumsFragment : Fragment() {

    lateinit var recyclerView: RecyclerView

    companion object {
        fun getInstance(): FavoriteAlbumsFragment {
            return FavoriteAlbumsFragment()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite_albums_page_viewer, container, false)
          recyclerView=view.findViewById(R.id.recyclerView)

        return view
    }



}
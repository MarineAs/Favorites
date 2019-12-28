package com.example.favorites.ui.fragments


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.favorites.model.ArtistViewModel
import com.example.favorites.adapter.OnItemClickListener
import com.example.favorites.R
import com.example.favorites.adapter.ArtistListsFragmentAdapter

class FavoriteArtistsFragment : Fragment(),
    OnItemClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ArtistListsFragmentAdapter
    private lateinit var viewModel: ArtistViewModel

    companion object {
        fun getInstance(): FavoriteArtistsFragment {
            return FavoriteArtistsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite_artists_page_viewer, container, false)

        viewModel = ViewModelProviders.of(this).get(ArtistViewModel::class.java)

        recyclerView = view.findViewById(R.id.recyclerView)

        setAdapter()

        observeViewModel()

        return view
    }


    private fun setAdapter() {

        adapter = ArtistListsFragmentAdapter(this)
        recyclerView.adapter = adapter
        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager

    }

    private fun observeViewModel() {

        viewModel.getLiveData().observe(viewLifecycleOwner, Observer { t ->
            adapter.submitList(t)
        })

    }

    override fun onItemClick(position: Int) {
        Toast.makeText(activity,"You clicked ${viewModel.getLiveData().value!![position].artistName}",Toast.LENGTH_LONG).show()
    }


    override fun onIconSettingsClick(position: Int) {
        Log.d("111", "clicked on settings")

    }

    override fun onItemHeartClick(position: Int) {
        viewModel.getData(position)

    }

}
package com.example.favorites.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.favorites.BR
import com.example.favorites.R
import com.example.favorites.databinding.RecyclerViewItemBinding
import com.example.favorites.difutil.DataDiffUtilCallback
import com.example.favorites.model.DataModel

class ArtistListsFragmentAdapter(private val onItemListener: OnItemClickListener) :
    ListAdapter<DataModel, ArtistDataBindingViewHolder>(
        DataDiffUtilCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistDataBindingViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: RecyclerViewItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.recycler_view_item,
            parent,
            false
        )
        return ArtistDataBindingViewHolder(binding, onItemListener)
    }

    override fun onBindViewHolder(holder: ArtistDataBindingViewHolder, position: Int) =
        holder.bind(getItem(position), position)
}

class ArtistDataBindingViewHolder(
    private val artistDataBinding: RecyclerViewItemBinding,
    private val onItemListener: OnItemClickListener
) :
    RecyclerView.ViewHolder(artistDataBinding.root) {

    fun bind(item: DataModel, position: Int) {
        artistDataBinding.setVariable(BR.artistData, item)
        artistDataBinding.clickHandler = onItemListener
        artistDataBinding.position = position
        artistDataBinding.executePendingBindings()
    }


}


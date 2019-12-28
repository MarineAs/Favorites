package com.example.favorites.difutil

import androidx.recyclerview.widget.DiffUtil
import com.example.favorites.model.DataModel

class DataDiffUtilCallback : DiffUtil.ItemCallback<DataModel>() {

    override fun areItemsTheSame(oldItem: DataModel, newItem: DataModel): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: DataModel, newItem: DataModel): Boolean {
        return oldItem.favorite==newItem.favorite
    }

}
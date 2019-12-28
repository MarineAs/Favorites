package com.example.favorites.adapter

interface OnItemClickListener {
    fun onItemClick(position: Int)
    fun onIconSettingsClick(position: Int)
    fun onItemHeartClick(position: Int)

}
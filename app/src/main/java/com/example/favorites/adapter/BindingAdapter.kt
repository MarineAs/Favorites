package com.example.favorites.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter



    @BindingAdapter(value=["android:src"],requireAll = true)
    fun showImage(imageView: ImageView,resoureId:String){

            val resId = imageView.context.resources.getIdentifier(
               resoureId,
                "drawable",
                imageView.context.packageName
            )

        imageView.setImageResource(resId)

    }


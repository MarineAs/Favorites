package com.example.favorites.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.favorites.model.Data
import com.example.favorites.model.DataModel

class ArtistViewModel : ViewModel() {

    private var objectLivaData = MutableLiveData<ArrayList<DataModel>>()
    fun getLiveData(): LiveData<ArrayList<DataModel>> = objectLivaData

    init {
        objectLivaData.value = Data.dataModel
    }

    fun getData(position: Int) {
        val oldModel = Data.dataModel[position]
        val newModel = DataModel(
            oldModel.id,
            oldModel.imageUrl,
            oldModel.artistName,
            oldModel.favorite
        )
        newModel.favorite = newModel.favorite != true
        val nwDataList: ArrayList<DataModel> = ArrayList()
        val dataList = objectLivaData.value ?: return
        nwDataList.addAll(dataList)
        nwDataList[position] = newModel
        this.objectLivaData.value = nwDataList
        oldModel.favorite = newModel.favorite
    }

}



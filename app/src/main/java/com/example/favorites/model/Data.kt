package com.example.favorites.model

object Data {
    var dataModel: ArrayList<DataModel> = ArrayList<DataModel>()


    init {
        var data1 = DataModel(
            1,
            "item2",
            "Imagine Dragons",
            false
        )
        var data2 =
            DataModel(2, "item20", "Zemfira", false)
        var data3 = DataModel(
            3,
            "item18",
            "System of a down",
            true
        )
        var data4 = DataModel(
            4,
            "item13",
            "Demi Lovato",
            false
        )
        var data5 =
            DataModel(5, "item12", "Jeremih", true)
        var data6 = DataModel(
            6,
            "item11",
            "Macklemore",
            true
        )
        var data7 = DataModel(
            7,
            "item10",
            "Emili Sande",
            false
        )
        var data8 = DataModel(
            8,
            "item9",
            "Caro Emerald",
            false
        )
        var data9 = DataModel(
            9,
            "item8",
            "Rae Sremurd",
            false
        )
        var data10 = DataModel(
            10,
            "item5",
            "Within Temptation",
            false
        )
        var data11 = DataModel(
            11,
            "item14",
            "Anathema",
            false
        )
        var data12 = DataModel(
            12,
            "item17",
            "Soulja Boy",
            false
        )
        var data13 =
            DataModel(13, "item19", "Rem", true)
        var data14 = DataModel(
            14,
            "item21",
            "Emma Shapplin",
            false
        )
        dataModel.add(data1)
        dataModel.add(data2)
        dataModel.add(data3)
        dataModel.add(data4)
        dataModel.add(data5)
        dataModel.add(data6)
        dataModel.add(data7)
        dataModel.add(data8)
        dataModel.add(data9)
        dataModel.add(data10)
        dataModel.add(data11)
        dataModel.add(data12)
        dataModel.add(data13)
        dataModel.add(data14)
    }

}
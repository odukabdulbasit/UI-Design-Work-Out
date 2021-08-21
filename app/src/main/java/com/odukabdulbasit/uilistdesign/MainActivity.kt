package com.odukabdulbasit.uilistdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Ara"

        val saleEggRcyclerView = findViewById<RecyclerView>(R.id.saleRecyclerView)
        saleEggRcyclerView.adapter = SaleEggListAdapter(getSaleEggModels())


        val eggRcyclerView = findViewById<RecyclerView>(R.id.eggRecycelerView)
        eggRcyclerView.adapter = EggListAdapter(getSaleEggModels())
    }

    fun getSaleEggModels(): MutableList<SaleEggModel> {

        val models = mutableListOf(
            SaleEggModel(R.drawable.egg1, "15TL", "Yumurta", "12'li"),
            SaleEggModel(R.drawable.egg2, "25TL", "Yumurta", "25'li"),
            SaleEggModel(R.drawable.egg3, "20TL", "Yumurta", "15'li"),

        )
        return models
    }

    fun getModels(): MutableList<SaleEggModel> {

        val models = mutableListOf(
            SaleEggModel(R.drawable.egg1, "20TL", "Organik Yumurta", "12'li"),
            SaleEggModel(R.drawable.egg2, "23TL", "Beyaz Yumurta", "15'li"),
            SaleEggModel(R.drawable.egg3, "20TL", "Yumurta", "12'li"),

            )
        return models
    }
}
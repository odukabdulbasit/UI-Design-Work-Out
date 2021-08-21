package com.odukabdulbasit.uilistdesign

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EggListAdapter (val eggList: MutableList<SaleEggModel>) : RecyclerView.Adapter<EggListAdapter.ModelViewHolder>() {

    class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val eggName: TextView = view.findViewById(R.id.nameAdapterTextView)
        val eggPrice: TextView = view.findViewById(R.id.priceAdapterTextView)
        val eggCount: TextView = view.findViewById(R.id.countAdapterTextView)
        val eggImage: ImageView = view.findViewById(R.id.imageViewAdepter)

        fun bindItems(item: SaleEggModel) {
            eggName.setText(item.name)
            eggPrice.setText(item.price)
            eggCount.setText(item.count)
            eggImage.setImageResource(item.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eggList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bindItems(eggList.get(position))
    }
}
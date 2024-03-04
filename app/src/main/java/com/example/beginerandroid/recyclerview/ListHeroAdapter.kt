package com.example.beginerandroid.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beginerandroid.R
import com.example.beginerandroid.databinding.ItemRowHeroBinding

class ListHeroAdapter(private  val listHero: ArrayList<Hero>): RecyclerView.Adapter<ListHeroAdapter.LIstViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    class LIstViewHolder(var binding: ItemRowHeroBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LIstViewHolder {
        val binding = ItemRowHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LIstViewHolder(binding)
    }

    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: LIstViewHolder, position: Int) {
        val (name, description, photo) = listHero[position]
        holder.binding.imgItemPhoto.setImageResource(photo)
        holder.binding.tvItemName.text = name
        holder.binding.tvItemDescription.text = description
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listHero[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Hero)
    }

}


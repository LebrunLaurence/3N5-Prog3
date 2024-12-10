package com.example.examen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.databinding.AndroidItemBinding

class SujetAdapter:ListAdapter<Sujet,SujetAdapter.SujetItemViewHolder>(SujetItemDiffCallBack){
    inner class SujetItemViewHolder(private val binding:AndroidItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(sujet:Sujet){
            binding.title.text = sujet.titre
            binding.nom.text = sujet.nom
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SujetItemViewHolder {
        val binding: AndroidItemBinding = AndroidItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SujetItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SujetItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object  SujetItemDiffCallBack: DiffUtil.ItemCallback<Sujet>(){
    override fun areItemsTheSame(oldItem: Sujet, newItem: Sujet): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Sujet, newItem: Sujet): Boolean {
        return oldItem == newItem
    }
}
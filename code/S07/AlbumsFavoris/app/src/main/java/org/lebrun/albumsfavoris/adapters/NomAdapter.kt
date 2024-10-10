package org.lebrun.albumsfavoris.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.lebrun.albumsfavoris.databinding.NomItemBinding

class NomAdapter:ListAdapter<String,NomAdapter.NomViewHolder>(NomDiffCallback) {

    inner class NomViewHolder(private val binding:NomItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:String){
            binding.nom.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomViewHolder {
        val binding:NomItemBinding = NomItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NomViewHolder, position: Int) {
        val item:String = getItem(position)
        holder.bind(item)
    }
}

object NomDiffCallback:DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}
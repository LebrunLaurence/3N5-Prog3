package org.lebrun.albumsfavoris.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.lebrun.albumsfavoris.databinding.MonItemBinding

class MonAdapter: ListAdapter<String, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {

    inner class MonItemViewHolder(private val binding: MonItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item: String){
            binding.TvItem.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding:MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item:String = getItem(position)
        holder.bind(item)
    }
}

object  MonItemDiffCallback:DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}
package org.lebrun.albumsfavoris.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.lebrun.albumsfavoris.MainActivity
import org.lebrun.albumsfavoris.SecondActivity
import org.lebrun.albumsfavoris.databinding.AlbumItemBinding
import org.lebrun.albumsfavoris.databinding.BingoItemBinding
import org.lebrun.albumsfavoris.models.Album
import org.lebrun.albumsfavoris.models.Bingo

class BingoAdapter: ListAdapter<Bingo, BingoAdapter.BingoItemViewHolder>(BingoItemDiffCallBack) {

    inner class BingoItemViewHolder(private val binding:BingoItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(bingo: Bingo){
            binding.nom.text = "Tirage #" + bingo.id
            binding.lettre.text = bingo.letter.toString()
            binding.noTiree.text = "Numéro Tiré : "+bingo.nombre.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BingoItemViewHolder {
        val binding: BingoItemBinding = BingoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BingoItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BingoItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object  BingoItemDiffCallBack: DiffUtil.ItemCallback<Bingo>(){
    override fun areItemsTheSame(oldItem: Bingo, newItem: Bingo): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Bingo, newItem: Bingo): Boolean {
        return oldItem == newItem
    }
}
package org.lebrun.albumsfavoris.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.lebrun.albumsfavoris.SecondActivity
import org.lebrun.albumsfavoris.databinding.AlbumItemBinding
import org.lebrun.albumsfavoris.models.Album

class AlbumAdapter: ListAdapter<Album, AlbumAdapter.AlbumItemViewHolder>(AlbumItemDiffCallBack) {

    inner class AlbumItemViewHolder(private val binding:AlbumItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(album:Album){
            binding.Nom.text = album.nom
            binding.desc.text = album.desc

            binding.albumLayout.setOnClickListener{
                val intent:Intent = Intent(binding.root.context,SecondActivity::class.java)
                intent.putExtra("AlbumNom",album.nom)
                intent.putExtra("AlbumDesc",album.desc)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumItemViewHolder {
        val binding: AlbumItemBinding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlbumItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object  AlbumItemDiffCallBack: DiffUtil.ItemCallback<Album>(){
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }
}
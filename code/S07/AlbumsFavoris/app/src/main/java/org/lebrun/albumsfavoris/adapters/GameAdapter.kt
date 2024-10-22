package org.lebrun.albumsfavoris.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.lebrun.albumsfavoris.GameActivity
import org.lebrun.albumsfavoris.SecondActivity
import org.lebrun.albumsfavoris.databinding.BingoItemBinding
import org.lebrun.albumsfavoris.databinding.GameItemBinding
import org.lebrun.albumsfavoris.models.Bingo
import org.lebrun.albumsfavoris.models.ListSingleton

class GameAdapter: ListAdapter<String, GameAdapter.GameItemViewHolder>(GameItemDiffCallBack) {

    inner class GameItemViewHolder(private val binding: GameItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item:String){
            binding.name.text = item

            var bd = ListSingleton.getInstance()

            binding.monter.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, GameActivity::class.java)
                bd.Up(item)
                binding.root.context.startActivity(intent)
            }

            binding.descendre.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, GameActivity::class.java)
                bd.Down(item)
                binding.root.context.startActivity(intent)
            }
        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameItemViewHolder {
        val binding: GameItemBinding = GameItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GameItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GameItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object  GameItemDiffCallBack: DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}
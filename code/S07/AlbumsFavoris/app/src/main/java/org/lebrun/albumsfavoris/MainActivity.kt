package org.lebrun.albumsfavoris

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.lebrun.albumsfavoris.adapters.AlbumAdapter
import org.lebrun.albumsfavoris.adapters.MonAdapter
import org.lebrun.albumsfavoris.databinding.ActivityMainBinding
import org.lebrun.albumsfavoris.models.Album

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var monadapter:MonAdapter
    private lateinit var adapterAlbum:AlbumAdapter
    val itemsAlbum:MutableList<Album> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)
        setupRecycler()
        fillRecycler()

        binding.bingo.setOnClickListener {
            val intent:Intent = Intent(binding.root.context, BingoActivity::class.java)
            binding.root.context.startActivity(intent)
        }

        binding.game.setOnClickListener {
            val intent:Intent = Intent(binding.root.context, GameActivity::class.java)
            binding.root.context.startActivity(intent)
        }

        binding.numbers.setOnClickListener {
            val intent:Intent = Intent(binding.root.context, NumbersActivity::class.java)
            binding.root.context.startActivity(intent)
        }

    }

    private fun setupRecycler() {
        monadapter = MonAdapter() // Créer l'adapteur
        binding.txMonAdapter.adapter = monadapter // Assigner l'adapteur au RecyclerView
        binding.txMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.txMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.txMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )

        adapterAlbum = AlbumAdapter() // Créer l'adapteur
        binding.albumAdapt.adapter = adapterAlbum // Assigner l'adapteur au RecyclerView
        binding.albumAdapt.setHasFixedSize(true) // Option pour améliorer les performances
        binding.albumAdapt.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.albumAdapt.context, DividerItemDecoration.VERTICAL
            )
        )
    }


    private fun fillRecycler(){
        val items:MutableList<String> = mutableListOf("Antigéo","J'ai bu","Comment Debord","La Nuit Est Une Panthère","Jaune","Bla bla bla","thing","film","othet thing","ithink")

        monadapter.submitList(items)

        if(itemsAlbum.count() == 0){
            for (i in 1..100){
                itemsAlbum.add(Album("Album #$i","random desc #$i",i))
            }
        }



        if(intent.hasExtra("ToDelete")){
            val albumToDelete = itemsAlbum.find { it.nom == intent.getStringExtra("ToDelete") }
            itemsAlbum.remove(albumToDelete)
        }

        adapterAlbum.submitList(itemsAlbum)
    }
}





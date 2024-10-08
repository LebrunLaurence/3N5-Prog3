package org.lebrun.albumsfavoris

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.lebrun.albumsfavoris.adapters.MonAdapter
import org.lebrun.albumsfavoris.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter:MonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.txMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.txMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.txMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.txMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler(){
        val items:MutableList<String> = mutableListOf("Antigéo","J'ai bu","Comment Debord","La Nuit Est Une Panthère","Jaune","Bla bla bla","thing","film","othet thing","ithink")

        adapter.submitList(items)
    }
}




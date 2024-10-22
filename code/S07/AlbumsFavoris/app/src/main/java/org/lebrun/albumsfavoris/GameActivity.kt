package org.lebrun.albumsfavoris

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.lebrun.albumsfavoris.adapters.GameAdapter
import org.lebrun.albumsfavoris.databinding.ActivityGameBinding
import org.lebrun.albumsfavoris.databinding.ActivitySecondBinding
import org.lebrun.albumsfavoris.models.ListSingleton

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    private lateinit var adapter: GameAdapter

    var itemList:List<String> = mutableListOf()

    var bd = ListSingleton.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.back.setOnClickListener {
            val intent: Intent = Intent(binding.root.context,MainActivity::class.java)
            binding.root.context.startActivity(intent)
        }

        setUpRecycler()
        fillRecycler()

        if(bd.IsSame()){
            binding.winning.text = "Won!"
        } else {
            binding.winning.text = "Not Won Yet!"
        }
    }

    private fun setUpRecycler() {
        adapter = GameAdapter() // Créer l'adapteur
        binding.adapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.adapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.adapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.adapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {

        if(bd.nameList.count() == 0){
            bd.nameList.add("Ringo")
            bd.nameList.add("Paul")
            bd.nameList.add("John")
            bd.nameList.add("George")

            bd.randomName.add("Ringo")
            bd.randomName.add("Paul")
            bd.randomName.add("John")
            bd.randomName.add("George")

            bd.Randomize()
        }

        adapter.submitList(bd.nameList) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
package com.example.examen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.examen.databinding.ActivityItemBinding
import com.example.examen.databinding.ActivityMainBinding

class ActivityItem : AppCompatActivity() {
    private lateinit var binding:ActivityItemBinding
    private lateinit var adapter: SujetAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        title = "Versions"
        setUpRecycler()
        fillRecycler()
    }
    private fun setUpRecycler(){
        adapter = SujetAdapter()
        binding.recycle.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.recycle.setHasFixedSize(true) // Option pour améliorer les performances
        binding.recycle.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.recycle.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler(){

        var list1 = listOf("Android 1.0","Android 1.5","Android 2.0","Android 3.0","Android 4.0","Android 5.0")
        var list2 = listOf("Petit four","Cupcake","Eclair","Honeycomb","Ice Cream Sandwich","Lollopop")
        var list3:ArrayList<Sujet> = ArrayList()

        for(i in 0..list2.count() - 1){
            list3.add((Sujet(list1[i],list2[i])))
        }

        adapter.submitList(list3)
    }
}


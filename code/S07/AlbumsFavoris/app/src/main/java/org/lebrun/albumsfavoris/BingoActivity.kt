package org.lebrun.albumsfavoris

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.lebrun.albumsfavoris.adapters.BingoAdapter
import org.lebrun.albumsfavoris.databinding.ActivityBingoBinding
import org.lebrun.albumsfavoris.databinding.ActivityMainBinding
import org.lebrun.albumsfavoris.models.Bingo

class BingoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBingoBinding
    private lateinit var adapter:BingoAdapter
    var ListBingo:MutableList<Bingo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBingoBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)
        SetUpRecycler()
        fillRecycler()

        binding.back.setOnClickListener {
            val intent: Intent = Intent(binding.root.context, MainActivity::class.java)
            binding.root.context.startActivity(intent)
        }
    }

    private fun SetUpRecycler(){
        adapter = BingoAdapter()
        binding.bingoRecycler.adapter = adapter
        binding.bingoRecycler.setHasFixedSize(true)
        binding.bingoRecycler.addItemDecoration(
            DividerItemDecoration(
                binding.bingoRecycler.context,DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler(){

        var i = 1
        var ListNo:MutableList<Int> = arrayListOf()
        while (ListBingo.count() != 75){
            val allowedChar:List<Char> = arrayListOf('B','I','N','G','O')
            val letter = allowedChar.random()

            var min = 0
            var max = 0

            if(letter == 'B'){
                min = 1
                max = 15
            }else if(letter == 'I'){
                min = 16
                max = 30
            }else if(letter == 'N'){
                min = 31
                max = 45
            }else if(letter == 'G'){
                min = 46
                max = 60
            } else if(letter == 'O'){
                min = 61
                max = 75
            }

            val allowedInt = (min..max)
            val number:Int = allowedInt.random()


            if(!ListNo.contains(number)){
                ListBingo.add(Bingo(i,letter,number))

                i++
            }


            ListNo.add(number)
        }

        adapter.submitList(ListBingo)
    }
}
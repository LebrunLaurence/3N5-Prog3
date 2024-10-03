package org.lebrun

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.lebrun.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var listeBoutons:List<Button>

    var scoreTops = 0
    var scoreFlops = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvTops.setOnClickListener(View.OnClickListener {
            println("Coucou")
            binding.tvTops.setText("Lapin")
        })

        listeBoutons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9
        )

        for(btn in listeBoutons){
            btn.setOnClickListener(){ reagirAuClic(it,listeBoutons,scoreTops,scoreFlops)}
        }

        initialiser(listeBoutons)
    }
}

fun initialiser(list:List<Button>){
    for (btn in list){
        btn.setText("Taupe")
    }

    val boutonLapin = list.random()
    boutonLapin.setText("Lapin")
}

fun reagirAuClic(it: View,list:List<Button>,scoreTops:Int, scoreFlops:Int){
     val boutonClique:Button = it as Button
    if(boutonClique.text == "Lapin"){
        boutonClique.setText("Taupe")
        initialiser(list)
        var valueTop = scoreTops + 1
    } else {
        var valueFlops =scoreFlops + 1
    }
    binding.tvTops.setText("Tops: $valueTop")
    binding.tvFlops.setText("Flops: $ValueFlops")
}
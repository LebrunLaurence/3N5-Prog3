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

fun reagirAuClic(){

}
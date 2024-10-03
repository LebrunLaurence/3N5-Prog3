package org.lebrun.activitnavigation

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.lebrun.activitnavigation.databinding.ActivityContactBinding
import org.lebrun.activitnavigation.databinding.ActivityMainBinding

class Contact : AppCompatActivity() {
    private lateinit var binding: ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        title = "Contact"

        binding.accueil.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)

            if(binding.edit.text.toString() != ""){
                intent.putExtra("TextBonjour", binding.edit.text.toString())
            }

            startActivity(intent)
        }


    }
}
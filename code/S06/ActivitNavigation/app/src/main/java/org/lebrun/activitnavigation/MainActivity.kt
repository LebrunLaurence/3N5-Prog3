package org.lebrun.activitnavigation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.lebrun.activitnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title = "Accueil"

        binding.article.setOnClickListener{
            val intent = Intent(this,Article::class.java)
            intent.putExtra("NoArticle",binding.picker.value.toString())
            startActivity(intent)
        }

        binding.contact.setOnClickListener{
            val intent = Intent(this,Contact::class.java)

            startActivity(intent)
        }

        binding.picker.maxValue=50
        binding.picker.minValue=0

        if(intent.hasExtra("TextBonjour")){
            binding.bonjour.setText("Bonjour "+intent.getStringExtra("TextBonjour"))
        }

        binding.phone.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:5555555555"))
            startActivity(intent)
        }

    }


}
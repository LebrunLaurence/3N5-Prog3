package org.lebrun.albumsfavoris

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.lebrun.albumsfavoris.adapters.AlbumAdapter
import org.lebrun.albumsfavoris.adapters.MonAdapter
import org.lebrun.albumsfavoris.databinding.ActivityMainBinding
import org.lebrun.albumsfavoris.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (intent.hasExtra("AlbumNom")){
            binding.secondName.text = intent.getStringExtra("AlbumNom")
        }
        if (intent.hasExtra("AlbumDesc")){
            binding.secondDesc.text = intent.getStringExtra("AlbumDesc")
        }

        binding.btnBack.setOnClickListener {
            val intent:Intent = Intent(binding.root.context,MainActivity::class.java)
            binding.root.context.startActivity(intent)
        }
    }


}
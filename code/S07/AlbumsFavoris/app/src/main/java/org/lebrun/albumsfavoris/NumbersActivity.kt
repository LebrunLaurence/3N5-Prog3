package org.lebrun.albumsfavoris

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.lebrun.albumsfavoris.databinding.ActivityBingoBinding
import org.lebrun.albumsfavoris.databinding.ActivityNumbersBinding
import org.lebrun.albumsfavoris.databinding.ActivitySecondBinding

class NumbersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNumbersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumbersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}
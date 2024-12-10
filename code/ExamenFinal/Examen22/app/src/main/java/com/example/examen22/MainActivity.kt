package com.example.examen22

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen22.databinding.ActivityMain2Binding
import com.example.examen22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        title = "Main Activity"

        binding.picker.maxValue = 10
        binding.picker.minValue = 0

        binding.button.setOnClickListener {
            val intent = Intent(this, ActivityMain2Binding::class.java)

            intent.putExtra("number",binding.picker.value.toString())

            startActivity(intent)
        }
    }
}
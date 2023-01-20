package com.example.ejercicio_7_pantalla_clases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_7_pantalla_clases.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonMago.setOnClickListener {
            binding.foto.setImageResource(R.drawable.mago)
        }
        binding.botonLadron.setOnClickListener {
            binding.foto.setImageResource(R.drawable.ladron)
        }
        binding.botonGuerrero.setOnClickListener {
            binding.foto.setImageResource(R.drawable.guerrero)
        }
        binding.botonBerserker.setOnClickListener {
            binding.foto.setImageResource(R.drawable.berserker)
        }

        binding.botonAceptar.setOnClickListener {
            val cambio= Intent(this, pantalla2::class.java)
            startActivity(cambio)
        }

    }
}
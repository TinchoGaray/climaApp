package com.tinchogaray.climaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvClima:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvClima = findViewById(R.id.tvClima)

        val ciudad = intent.getStringExtra("com.tinchogaray.climaapp.ciudades.CIUDAD")

        val ciudadCba = Ciudad("Córdoba", 25, "Soleado")
        val ciudadLondres = Ciudad("Londres", 15, "Nublado")

        if(ciudad == "ciudad-cordoba"){
            tvCiudad?.text = ciudadCba.nombre
            tvClima?.text = ciudadCba.clima
            tvGrados?.text = ciudadCba.grados.toString() + "º"
        }
        else{
            tvCiudad?.text = ciudadLondres.nombre
            tvClima?.text = ciudadLondres.clima
            tvGrados?.text = ciudadLondres.grados.toString() + "º"
        }

    }
}
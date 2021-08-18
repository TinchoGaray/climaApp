package com.tinchogaray.climaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val TAG = "com.tinchogaray.climaapp.ciudades.CIUDAD"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val btnCordoba = findViewById<Button>(R.id.btnCordoba)
        val btnLondres = findViewById<Button>(R.id.btnLondres)

        btnCordoba.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            intent.putExtra(TAG, "ciudad-cordoba")

            startActivity(intent)
        })

        btnLondres.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            intent.putExtra(TAG, "ciudad-berlin")

            startActivity(intent)
        })

    }
}
package com.example.cp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class second_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_screen)

        val btn_avancar: Button = findViewById(R.id.btn_integrantes)
        btn_avancar.setOnClickListener {
            thirdScreen()
        }
    }

    private fun thirdScreen() {
        val integrantes = Intent(this, third_screen::class.java)
        startActivity(integrantes)
    }
}
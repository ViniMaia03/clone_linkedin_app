package com.example.cp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_nav: Button = findViewById(R.id.btn_feed)
        btn_nav.setOnClickListener {
            secondScreen()
        }
    }

    private fun secondScreen() {
        val feed = Intent(this, second_screen::class.java)
        startActivity(feed)
    }
}

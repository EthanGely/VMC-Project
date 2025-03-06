package com.example.vmcproject

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val powerButton: ImageButton = findViewById(R.id.powerButton)
        powerButton.setOnClickListener {
            Toast.makeText(this, "Bouton d'alimentation pressé", Toast.LENGTH_SHORT).show()
        }
    }
}

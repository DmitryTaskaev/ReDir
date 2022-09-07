package com.example.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var buttonVK: Button
    private lateinit var buttonYT: Button
    private lateinit var buttonOZ: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonVK = findViewById(R.id.buttonVK)
        buttonYT = findViewById(R.id.buttonYT)
        buttonOZ = findViewById(R.id.buttonOZ)

        val browserIntentVK = Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com"))
        val browserIntentYT = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"))
        val browserIntentOZ = Intent(Intent.ACTION_VIEW, Uri.parse("https://ozon.com"))

        buttonVK.setOnClickListener(){
            startActivity(browserIntentVK)
        }
        buttonYT.setOnClickListener(){
            startActivity(browserIntentYT)
        }
        buttonOZ.setOnClickListener(){
            startActivity(browserIntentOZ)
        }

    }
}
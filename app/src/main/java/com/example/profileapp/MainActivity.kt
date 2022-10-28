package com.example.profileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileButton = findViewById(R.id.profile_button)

        profileButton.setOnClickListener {
            var intent = Intent(this@MainActivity, profileScreen::class.java).also{
                startActivity(it)
            }
        }




    }
}
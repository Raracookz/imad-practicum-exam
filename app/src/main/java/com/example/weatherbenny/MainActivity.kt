package com.example.weatherbenny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start_button = findViewById<Button>(R.id.start_button)
        val exit_button = findViewById<Button>(R.id.exit_button)
        /*
        startButton.setOnClcklistener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(Intent)

        }
     */

        start_button.setOnClickListener {
            val intent = Intent (this,HomeActivity::class.java)
            startActivity(intent)
        }

        exit_button.setOnClickListener{
            finish()
        }
    }
}
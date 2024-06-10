package com.example.weatherbenny

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val editTextDate2 = findViewById<TextView>(R.id.editTextDate2)
        val conditions = findViewById<TextView>(R.id.conditions)
        val minimum = findViewById<TextView>(R.id.minimum)
        val maximum = findViewById<TextView>(R.id.maximum)
        val goBackButton = findViewById<Button>(R.id.goBackButton)

        // Retrieve data from intent
        val selectedDay = intent.getStringExtra("selectedDay")
        val condition = intent.getStringExtra("condition")
        val min = intent.getStringExtra("Min")
        val max = intent.getStringExtra("Max")

        // Set data to TextViews
        editTextDate2.text = selectedDay
        conditions.text = "Conditions: $condition"
        minimum.text = "Minimum: $min"
        maximum.text = "Maximum: $max"

        goBackButton.setOnClickListener {
            finish() // This is supposed to close the DetailedActivity and go back to HomeActivity
        }
    }
}
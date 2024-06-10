package com.example.weatherbenny

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    // I have defined the arrays
    private var days =
        arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private var condition = arrayOf("Sunny", "Sunny", "##", "##", "##", "Raining", "Cold")
    private var Min = arrayOf("12", "15", "##", "##", "##", "10", "10")
    private var Max = arrayOf("25", "29", "##", "##", "##", "18", "16")

    private lateinit var editTextDate: EditText
    private lateinit var weatherOutput: TextView
    private lateinit var generateButton: Button
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val goBackToSplash = findViewById<Button>(R.id.goBackToSplash)
        goBackToSplash.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val goToDetailedView = findViewById<Button>(R.id.goToDetailedView)
        goToDetailedView.setOnClickListener {
            startActivity(Intent(this, DetailedActivity::class.java))
            finish()
        }
    }
}
/*
        // This is where we initialize views
        editTextDate = findViewById(R.id.editTextDate)
        weatherOutput = findViewById(R.id.Weather_output)
        generateButton = findViewById(R.id.btnGenerate)
        clearButton = findViewById(R.id.clearButton)

        // here goes the set click listeners
        generateButton.setOnClickListener { generateWeather() }
        clearButton.setOnClickListener { clearOutput() }
    }

    private fun generateWeather() {
        val selectedDay = editTextDate.text.toString()

        // Find the index of the selected day
        val index = days.indexOf(selectedDay)

        if (index != -1) {

            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("selectedDay", selectedDay)
            intent.putExtra("condition", condition[index])
            intent.putExtra("Min", Min[index])
            intent.putExtra("Max", Max[index])
            startActivity(intent)
        } else {
            // if day is not found
            weatherOutput.text = "Weather information not available for this day."
        }
    }

    private fun clearOutput() {
        // Clear the weather output text
        weatherOutput.text = ""
    }


    private fun generateAverage() {
        val selectedDay = editTextDate.text.toString()

        val averageAnswer = findViewById<TextView>(R.id.averageAnswer)
        // Find the index of the selected day
        val index = days.indexOf(selectedDay)

        if (index != -1) {
            // Display corresponding weather information
            val weatherInfo =
                "Condition: ${condition[index]}\nMin: ${Min[index]}\nMax: ${Max[index]}"
            weatherOutput.text = weatherInfo

            // Calculate average temperature for the week
            var totalMin = 0
            var totalMax = 0

            // Loop through Min and Max arrays to calculate sum
            for (i in Min.indices) {
                if (Min[i] != "##" && Max[i] != "##") {
                    totalMin += Min[i].toInt()
                    totalMax += Max[i].toInt()
                }
            }

            // Calculate average
            val averageMin = totalMin.toDouble() / days.size
            val averageMax = totalMax.toDouble() / days.size

            // Display average temperature
            val averageInfo = "Average Min: $averageMin\nAverage Max: $averageMax"
            averageAnswer.text = averageInfo
        } else {
            // Day not found
            weatherOutput.text = "Weather information not available for this day."
        }


    }
}
*/
















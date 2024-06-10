package com.example.weatherbenny

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private var editTextDate: EditText?= null
    private var Weather_output: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        editTextDate = findViewById(R.id.editTextDate)
        Weather_output = findViewById(R.id.Weather_output)


        val editTextDate = findViewById<EditText>(R.id.editTextDate)

        val Weather_output = findViewById<TextView>(R.id.Weather_output)

        val goToDetailedView = findViewById<Button>(R.id.goToDetailedView)
        goToDetailedView.setOnClickListener{
            startActivity(Intent(this, DetailedActivity::class.java))
            finish()
        }

        val average_button = findViewById<Button>(R.id.average_button)


        val averageAnswer = findViewById<TextView>(R.id.averageAnswer)

        val clearButton = findViewById<Button>(R.id.clearButton)





    }

    private fun

    var days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    var condition = arrayOf("Sunny", "Sunny", "##", "##", "##", "Raining", "Cold")
    var Min = arrayOf("12", "15", "##", "##", "##", "10", "10")
    var Max = arrayOf("25", "29", "##", "##", "##", "18", "16")









    }


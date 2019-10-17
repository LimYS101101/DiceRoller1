package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resultText: TextView = findViewById(R.id.result_text)
       resultText.text = "Dice Rolled!"

    }


    private fun rollDice(){

        val randomInt = Random().nextInt (6) + 1
        val randomInt1 = Random().nextInt (6) + 1
        val randomInt2 = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        val resultText1: TextView = findViewById(R.id.result_text1)
        resultText1.text = randomInt1.toString()

        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText2.text = randomInt2.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }
}

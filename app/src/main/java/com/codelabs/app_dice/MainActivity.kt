package com.codelabs.app_dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    private lateinit var diceImage_2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDices() }


    }
    private fun rollDice(diceSelected:Int){
        val randomInt = (1..6).random()
        
        val resultText: TextView = when (diceSelected){
            1 -> findViewById(R.id.result_text_1)
            2 -> findViewById(R.id.result_text_2)
            else ->findViewById(R.id.result_text_1)
        }
        resultText.text= randomInt.toString()
        val diceImage:ImageView = when (diceSelected){
            1 -> findViewById(R.id.dice_image_1)
            2 -> findViewById(R.id.dice_image_2)
            else -> findViewById(R.id.dice_image_1)
        }
        val drawableResource = when (randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
    //TODO next function for the button
    private fun rollDices(){
        rollDice(1)
        rollDice(2)
    }
}
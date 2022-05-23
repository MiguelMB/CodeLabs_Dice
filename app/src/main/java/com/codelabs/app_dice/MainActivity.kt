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

    }
    private fun rollDice(diceSelected:Int){
        String[] buttonIDs = new int[]{R.id.dice_image; R.id.dice_image_2}
        var diceArray = arrayOf<String>("1","2");

        String[] textIDs = new int[]{R.id.result_text; R.id.result_text_2}
        val randomInt = (1..6).random()
        Toast.makeText(this,"Dice thrown",Toast.LENGTH_SHORT).show()
        val resIdDice = resources.getIdentifier( "R.id.dice_image_"+diceArray[diceSelected], "id", packageName)
        val resultText: TextView = findViewById(resIdDice)




    }
}
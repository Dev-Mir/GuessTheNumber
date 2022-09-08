package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    var numToGuess : Int = 0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var random : Random = Random();
        numToGuess = random.nextInt(10)
}
   public fun validate(v : View) {

    var inputField = findViewById<EditText>(R.id.textbox1)
    var textLabel = findViewById<TextView>(R.id.textLabel);

        val number = Integer.parseInt(inputField.text.toString());

        if(number > numToGuess){
            textLabel.text = "Your Guess is Too High"
        }

        else if(number < numToGuess){
            textLabel.text = "Your Guess is Too Low"
        }

        else{
            textLabel.text = "You Guessed Perfectly"
        }



    }


}
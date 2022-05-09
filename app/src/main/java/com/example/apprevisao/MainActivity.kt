package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.testButton).setOnClickListener{
            comparrationResult(it)
        }
    }

    private fun comparrationResult(view: View){
        val editNumber1 = findViewById<EditText>(R.id.number1)
        val editNumber2 = findViewById<EditText>(R.id.number2)

        val number1 = Integer.parseInt(editNumber1.text.toString())
        val number2 = Integer.parseInt(editNumber2.text.toString())

        val comparrationTextView =  findViewById<TextView>(R.id.comparration)

        if (number1 == number2){
            comparrationTextView.setText("number1 = number2")
            Toast.makeText(this, "The numbers are equals", Toast.LENGTH_LONG).show()
        }else{
            if (number1 > number2){
                comparrationTextView.setText("number1 > number2")
            }else{
                comparrationTextView.setText("number1 < number2")
            }
        }
    }
}
package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.testButton).setOnClickListener{
            comparation(it)
        }
    }

    private fun comparation(view: View){
        val num1 = findViewById<EditText>(R.id.number1)
        val num2 = findViewById<EditText>(R.id.number2)
        val comparationResult = findViewById<TextView>(R.id.comparration)

        if (num1==num2){
            comparationResult.text = "num1.toString() = num2.toString()"
            view.visibility = View.GONE
            comparationResult.visibility = View.VISIBLE
        }
    }
}
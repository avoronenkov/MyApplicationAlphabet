package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val alphabet = arrayOf(
           'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
           'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
           'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
           'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')
       for (i in 0..alphabet.lastIndex){
           if ((i + 1) % 2 == 0 ){
               Log.d("Четная буква ", alphabet[i].toString())

           }

        }
        var textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener{
            for (i in 0..alphabet.lastIndex){
                if ((i + 1) % 2 == 0 ) {
                    Toast.makeText(this, "Четная буква " + alphabet[i].toString(), LENGTH_SHORT).show()

                    Log.d("Четная буква :", alphabet[i].toString())
                }

                }
        }
    }
}
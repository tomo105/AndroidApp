package com.example.firtstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        bigButton.setOnClickListener {   //gdy ktos kliknie tosie wykona
            d("tomek ", "Button was clicked !!")
            startActivity(Intent(this,AboutMe::class.java))
        }

        GameButton.setOnClickListener {
            d("tomus"," Hello you little bastard ${editText.text}!")
            MessageButton.text = "Hello ${editText.text}!!!"

        }

    }
}

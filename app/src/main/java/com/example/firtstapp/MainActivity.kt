package com.example.firtstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        bigButton.setOnClickListener {
            d("tomek ", "Button was clicked !!")
            startActivity(Intent(this,AboutMe::class.   java))
        }

        GameButton.setOnClickListener {
            d("tomus"," Hello you little bastard ${editText.text}!")
            MessageButton.text = "Hello ${editText.text}!!!"
            if(editText.text.toString() == "speedway")
                FijiImage.setImageResource(R.drawable.speedway)
            else if (editText.text.toString() == "fiji")
                FijiImage.setImageResource(R.drawable.fiji)
        }


    }
}

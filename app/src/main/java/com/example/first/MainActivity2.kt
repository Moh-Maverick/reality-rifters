package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button1:ImageButton=findViewById(R.id.option1)
        val button2:ImageButton=findViewById(R.id.option2)
        val button3:ImageButton=findViewById(R.id.option3)


        button3.setOnClickListener {
            val intent = Intent(this,Option3Page::class.java)
            startActivity(intent)

        }








    }
}
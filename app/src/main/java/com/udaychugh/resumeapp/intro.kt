package com.udaychugh.resumeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class intro : AppCompatActivity() {

    lateinit var intro : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        intro=findViewById(R.id.next_btn)

        intro.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

    }
}
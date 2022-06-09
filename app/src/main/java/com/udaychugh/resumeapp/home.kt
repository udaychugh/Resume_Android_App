package com.udaychugh.resumeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class home : AppCompatActivity() {

    lateinit var education : RelativeLayout
    lateinit var exp : RelativeLayout
    lateinit var skills : RelativeLayout
    lateinit var projects : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        education=findViewById(R.id.education)
        exp=findViewById(R.id.experience)
        skills=findViewById(R.id.skills)
        projects=findViewById(R.id.projects)

        education.setOnClickListener {
            val intent = Intent(this, com.udaychugh.resumeapp.education::class.java)
            startActivity(intent)
        }

        exp.setOnClickListener {
            val intent = Intent(this, experience::class.java)
            startActivity(intent)
        }

        skills.setOnClickListener {
            val intent = Intent(this, com.udaychugh.resumeapp.skills::class.java)
            startActivity(intent)
        }

        projects.setOnClickListener {
            val intent = Intent(this, com.udaychugh.resumeapp.projects::class.java)
            startActivity(intent)
        }

    }
}
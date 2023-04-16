package com.example.myjournal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.myjournal.R

class MusicActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_meditation)
        imageView=findViewById(R.id.imageView3)
        imageView1=findViewById(R.id.imageView5)
        imageView2=findViewById(R.id.imageView7)
        imageView.setOnClickListener {
            // adding a click listener for fab button
            // and opening a new intent to add a new note.
            val intent = Intent(this@MusicActivity,Song1Activity::class.java)
            startActivity(intent)

        }
        imageView1.setOnClickListener {
            // adding a click listener for fab button
            // and opening a new intent to add a new note.
            val intent = Intent(this@MusicActivity,Song3Activity::class.java)
            startActivity(intent)

        }
        imageView2.setOnClickListener {
            // adding a click listener for fab button
            // and opening a new intent to add a new note.
            val intent = Intent(this@MusicActivity,Song2Activity::class.java)
            startActivity(intent)

        }

    }
}
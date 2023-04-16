package com.example.myjournal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
//import com.example.mediaplayer.MusicActivity

class HomeActivity : AppCompatActivity() {
    lateinit var linearLayout: LinearLayout
    lateinit var imageView: ImageView
    lateinit var meditation: LinearLayout
    lateinit var motivation:LinearLayout
    lateinit var  depression:LinearLayout
    lateinit var anxious:LinearLayout
    lateinit var stressed:LinearLayout
    lateinit var anger:LinearLayout
    lateinit var serenityid:LinearLayout
    lateinit var lonelyid:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getSupportActionBar()?.hide()

        setContentView(R.layout.activity_home)
        linearLayout=findViewById(R.id.journal)
      anger=findViewById(R.id.anger)
        meditation=findViewById(R.id.meditation)
        depression=findViewById(R.id.depression)
        motivation =findViewById(R.id.motivation)
        anxious=findViewById(R.id.anxious)
        stressed=findViewById(R.id.stressed)
        serenityid=findViewById(R.id.serenityid)
        lonelyid=findViewById(R.id.lonelyid)
        linearLayout.setOnClickListener {
            // adding a click listener for fab button
            // and opening a new intent to add a new note.
            val intent = Intent(this@HomeActivity,JournalActivity::class.java)
            startActivity(intent)

        }
        anger.setOnClickListener {
            // adding a click listener for fab button
            // and opening a new intent to add a new note.
            val intent = Intent(this@HomeActivity,AngerActivity::class.java)
            startActivity(intent)

        }
        meditation.setOnClickListener{
            val intent=Intent(this@HomeActivity,MusicActivity::class.java)
            startActivity(intent)
        }
motivation.setOnClickListener{
    val intent=Intent(this@HomeActivity,QuoteActivity::class.java)
    startActivity(intent)
}
        depression.setOnClickListener{
            val intent=Intent(this@HomeActivity,DepressionActivity::class.java)
            startActivity(intent)

        }
        anxious.setOnClickListener{
            val intent=Intent(this@HomeActivity,AnxietyActivity::class.java)
            startActivity(intent)

        }
        stressed.setOnClickListener{
            val intent=Intent(this@HomeActivity,StressedActivity::class.java)
            startActivity(intent)
        }
        serenityid.setOnClickListener{
            val intent=Intent(this@HomeActivity,SerenityActivity::class.java)
            startActivity(intent)
        }
lonelyid.setOnClickListener{
    val intent=Intent(this@HomeActivity,LonelyActivity::class.java)
    startActivity(intent)
}
    }
}
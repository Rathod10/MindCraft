package com.example.myjournal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class QuoteActivity : AppCompatActivity() {

    private lateinit var quoteText: TextView
    private lateinit var newQuoteButton: Button
    private lateinit var quotesArray: Array<String>
    private lateinit var backgroundsArray: Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)
        getSupportActionBar()?.hide()

        // Initialize views
        quoteText = findViewById(R.id.quote_text)
        newQuoteButton = findViewById(R.id.new_quote_button)

        // Initialize arrays
        quotesArray = resources.getStringArray(R.array.quotes_array)
        backgroundsArray = arrayOf(
            R.drawable.background1,
            R.drawable.background2,
            R.drawable.background3,
            R.drawable.background4,
            R.drawable.background5,
            R.drawable.background6
        )

        // Set initial background image
        val randomBackground = backgroundsArray.random()
        findViewById<RelativeLayout>(R.id.quotes_layout).setBackgroundResource(randomBackground)

        // Set initial quote
        quoteText.text = quotesArray.random()

        // Set click listener for "New Quote" button
        newQuoteButton.setOnClickListener {
            // Set new background image
            val randomBackground = backgroundsArray.random()
            findViewById<RelativeLayout>(R.id.quotes_layout).setBackgroundResource(randomBackground)

            // Set new quote
            quoteText.text = quotesArray.random()
        }
    }
}

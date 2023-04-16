package com.example.myjournal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class LonelyActivity : AppCompatActivity() {

    // on below line we are creating variable for view pager,
    // viewpager adapter and the image list.
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lonely)
        getSupportActionBar()?.hide()
        // initializing variables
        // of below line with their id.
        viewPager = findViewById(R.id.idViewPager)

        // on below line we are initializing
        // our image list and adding data to it.
        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.lonely3


        // on below line we are initializing our view
        // pager adapter and adding image list to it.
        viewPagerAdapter = ViewPagerAdapter(this@LonelyActivity, imageList)

        // on below line we are setting
        // adapter to our view pager.
        viewPager.adapter = viewPagerAdapter
    }
}
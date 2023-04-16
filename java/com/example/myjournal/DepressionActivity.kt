package com.example.myjournal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class DepressionActivity : AppCompatActivity() {

    // on below line we are creating variable for view pager,
    // viewpager adapter and the image list.
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depression)
        getSupportActionBar()?.hide()
        // initializing variables
        // of below line with their id.
        viewPager = findViewById(R.id.idViewPager)

        // on below line we are initializing
        // our image list and adding data to it.
        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.depression1
        imageList = imageList + R.drawable.depression2
        imageList =imageList  +  R.drawable.depression3


        // on below line we are initializing our view
        // pager adapter and adding image list to it.
        viewPagerAdapter = ViewPagerAdapter(this@DepressionActivity, imageList)

        // on below line we are setting
        // adapter to our view pager.
        viewPager.adapter = viewPagerAdapter
    }
}
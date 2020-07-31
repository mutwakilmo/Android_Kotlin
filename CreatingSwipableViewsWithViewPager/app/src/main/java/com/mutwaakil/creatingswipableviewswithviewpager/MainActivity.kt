package com.mutwaakil.creatingswipableviewswithviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.bg01,
            R.drawable.bg02,
            R.drawable.bg03,
            R.drawable.bg4,
            R.drawable.bg6,
            R.drawable.bg4
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
        //Vertically
        //viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        //Swap automatically without the user
//        viewPager.beginFakeDrag()
//        viewPager.fakeDragBy(-10f)
//        viewPager.endFakeDrag()
    }
}
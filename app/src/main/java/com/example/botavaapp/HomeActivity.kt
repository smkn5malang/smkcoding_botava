package com.example.botavaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import com.denzcoskun.imageslider.models.SlideModel
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    var images = arrayOf(R.drawable.jahe,R.drawable.lidahbuaya,R.drawable.bengkoang,R.drawable.jinten,R.drawable.timun)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        viewpager.adapter=SliderAdapter(applicationContext,images)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.jahe))
        imageList.add(SlideModel(R.drawable.lidahbuaya))
        imageList.add(SlideModel(R.drawable.bengkoang))
        imageList.add(SlideModel(R.drawable.jinten))
        imageList.add(SlideModel(R.drawable.timun))
        slider.setImageList(imageList)
    }
}

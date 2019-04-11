package com.example.botavaapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.slider_image_item.view.*

class SliderAdapter(val context: Context,val images:Array<Int>):PagerAdapter() {
    override fun isViewFromObject(view: View, o: Any): Boolean {
        return view == o

    }

    override fun getCount(): Int = images.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view=inflater.inflate(R.layout.slider_image_item,container,false)
        view.slider_image.setImageResource(images[position])

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, o: Any) {
        var view = o as View
        container.removeView(view)
    }

}



package com.example.botavaapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SliderItem : Fragment() {

    var image:Int?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view=inflater.inflate(R.layout.slider_image_item,container,false)
        return view
    }

    fun setImage(image:Int){
        this.image=image
    }
}
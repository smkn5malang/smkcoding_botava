package com.example.botavaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.botavaapp.R.layout.activity_main)

        //4second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this, LoginActivity::class.java))
            //finish this activity
            finish()
        },3000)
    }
}

package com.errorfoundtechnologies.service

import android.app.Service
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var i =intent
        b1.setOnClickListener {

             i = Intent(this,ItsService::class.java)
            startService(i)
        }

        b2.setOnClickListener {
            i = Intent(this,ItsService::class.java)
            stopService(i)
        }
    }
}

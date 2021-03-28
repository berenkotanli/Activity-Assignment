package com.beren.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_y)
    }
    override fun onBackPressed() {
        val intent = Intent(this@ActivityY,MainActivity::class.java)
        startActivity(intent)
    }

}
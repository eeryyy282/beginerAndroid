package com.example.beginerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDelete(data: String, data2: Int): String {
        if (true) {
            var data = "Testing string 1 2 3"
            var data2= 22
        }
        return data + data2
    }


}
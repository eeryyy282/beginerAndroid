package com.example.beginerandroid.viewandviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.beginerandroid.MainActivity
import com.example.beginerandroid.R

class LearnViewAndViewGroup : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBuy: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_view_and_view_group)

        btnBuy = findViewById(R.id.btn_buy_product)
        btnBuy.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_buy_product -> {
                val buyThisProduct = Intent(this@LearnViewAndViewGroup, MainActivity::class.java)
                startActivity(buyThisProduct)
            }
        }
    }
}
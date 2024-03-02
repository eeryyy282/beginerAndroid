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
    private lateinit var btnConstraintLayout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_view_and_view_group)

        btnBuy = findViewById(R.id.btn_buy_product)
        btnBuy.setOnClickListener(this)

        btnConstraintLayout = findViewById(R.id.btn_constraint_layout)
        btnConstraintLayout.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_buy_product -> {
                val buyThisProduct = Intent(this@LearnViewAndViewGroup, MainActivity::class.java)
                startActivity(buyThisProduct)
            }
            R.id.btn_constraint_layout -> {
                val moveToConstraintLayout = Intent(this@LearnViewAndViewGroup, ViewAndViewGroupWithConstraintLayout::class.java)
                startActivity(moveToConstraintLayout)
            }
        }
    }
}
package com.example.beginerandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveToLearnActivity: Button = findViewById(R.id.btn_move_activity_to_learn_activity)
        btnMoveToLearnActivity.setOnClickListener(this)

        val btnMoveToIntent: Button = findViewById(R.id.btn_move_activity_to_Intent)
        btnMoveToIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity_to_learn_activity -> {
                val moveToLearnActivity = Intent(this@MainActivity, LearnActivity::class.java)
                startActivity(moveToLearnActivity)
            }
            R.id.btn_move_activity_to_Intent -> {
                val moveToIntent = Intent(this@MainActivity, LearnIntent::class.java)
                startActivity(moveToIntent)
            }
        }
    }
}
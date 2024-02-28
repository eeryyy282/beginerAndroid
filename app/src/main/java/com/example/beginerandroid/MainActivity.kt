package com.example.beginerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtWidth = findViewById(R.id.edt_width)
        edtHeight = findViewById(R.id.edt_height)
        edtLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
        btnCalculate.setOnClickListener(this)

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            tvResult.text = result
        }
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputLength = edtLength.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            var isEmptyFields = false
            var textKosong: String = "Field ini tidak boleh kosong"
            if (inputLength.isEmpty()) {
                isEmptyFields = true
                edtLength.error = textKosong
            }
            if (inputHeight.isEmpty()) {
                isEmptyFields = true
                edtHeight.error = textKosong
            }
            if (inputWidth.isEmpty()) {
                isEmptyFields = true
                edtWidth.error = textKosong
            }
            if (!isEmptyFields) {
                val volume = inputLength.toDouble() * inputHeight.toDouble() * inputWidth.toDouble()
                tvResult.text = volume.toString()
            }
        }
    }
    companion object {
        private const val STATE_RESULT = "state_result"
    }
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putString(STATE_RESULT, tvResult.text.toString())
    }
}
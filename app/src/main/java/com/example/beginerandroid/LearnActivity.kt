package com.example.beginerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.example.beginerandroid.databinding.LearnActivityBinding

class LearnActivity : AppCompatActivity(), View.OnClickListener {

private lateinit var binding: LearnActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_activity)
        binding = LearnActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalculate.setOnClickListener(this)

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            binding.tvResult.text = result
        }
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputLength = binding.edtLength.text.toString().trim()
            val inputHeight = binding.edtHeight.text.toString().trim()
            val inputWidth = binding.edtWidth.text.toString().trim()
            var isEmptyFields = false
            var textKosong: String = "Field ini tidak boleh kosong"
            if (inputLength.isEmpty()) {
                isEmptyFields = true
                binding.edtLength.error = textKosong
            }
            if (inputHeight.isEmpty()) {
                isEmptyFields = true
                binding.edtHeight.error = textKosong
            }
            if (inputWidth.isEmpty()) {
                isEmptyFields = true
                binding.edtWidth.error = textKosong
            }
            if (!isEmptyFields) {
                val volume = inputLength.toDouble() * inputHeight.toDouble() * inputWidth.toDouble()
                binding.tvResult.text = volume.toString()
            }
        }
    }
    companion object {
        private const val STATE_RESULT = "state_result"
    }
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putString(STATE_RESULT, binding.tvResult.text.toString())
    }
}
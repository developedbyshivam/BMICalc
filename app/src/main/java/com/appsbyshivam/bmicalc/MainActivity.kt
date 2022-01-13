package com.appsbyshivam.bmicalc

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsbyshivam.bmicalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val weight = binding.etWeight.text
        val height = binding.etHeight.text



        binding.btnCalculate.setOnClickListener {

            if (weight.isEmpty() || height.isEmpty()) {
                Toast.makeText(this, "Fields can not be empty", Toast.LENGTH_SHORT).show()
            } else if (weight.toString().toDouble() < 0 || weight.toString().toDouble() > 600) {
                Toast.makeText(this, "Invalid or High Weight Entered", Toast.LENGTH_SHORT).show()
            } else {
                val weightALT = weight.toString().toDouble()
                val heightALT = (height.toString().toDouble()) / 100
                val bmi = (weightALT / (heightALT * heightALT)).toString()

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("BMI", bmi)
                startActivity(intent)
            }

        }

        binding.ivInfo.setOnClickListener {
            val intentInfo = Intent(this, InfoActivity::class.java)
            startActivity(intentInfo)
        }
    }
}
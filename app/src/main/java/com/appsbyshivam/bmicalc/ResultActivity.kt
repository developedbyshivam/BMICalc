package com.appsbyshivam.bmicalc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.appsbyshivam.bmicalc.R.drawable
import com.appsbyshivam.bmicalc.R.string
import com.appsbyshivam.bmicalc.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bmi1 = intent.getStringExtra("BMI")
        val bmi = bmi1.toString().toDouble()
        val solution = String.format("%.2f",bmi)
        binding.tvResult1.text = "YOUR BMI IS $solution"

        if (bmi < 18.5) {
            binding.tvResult2.text = getString(string.uwr1)
            binding.mark.setImageResource(drawable.exclaimation)
            binding.tvTips.text = getString(string.uwr2)
            binding.Tips1.text = getString(string.uw1)
            binding.Tips2.text = getString(string.uw2)
            binding.Tips3.text = getString(string.uw3)
            binding.Tips4.text = getString(string.uw4)
            binding.Tips5.text = getString(string.uw5)
        } else if (bmi >= 18.5 && bmi < 25) {
            binding.tvResult2.text = getString(string.nwr1)
            binding.tvResult1.setTextColor(ContextCompat.getColor(this, R.color.green))
            binding.mark.setImageResource(drawable.check)
            binding.tvTips.text = getString(string.nwr2)
            binding.Tips1.text = getString(string.nw1)
            binding.Tips2.text = getString(string.nw2)
            binding.Tips3.text = getString(string.nw3)
            binding.Tips4.text = getString(string.nw4)
            binding.Tips5.text = getString(string.nw5)
        } else if (bmi >= 25 && bmi < 30) {
            binding.tvResult2.text = getString(string.owr1)
            binding.mark.setImageResource(drawable.exclaimation)
            binding.tvTips.text = getString(string.owr2)
            binding.Tips1.text = getString(string.ow1)
            binding.Tips2.text = getString(string.ow2)
            binding.Tips3.text = getString(string.ow3)
            binding.Tips4.text = getString(string.ow4)
            binding.Tips5.text = getString(string.ow5)
        } else if (bmi >= 30) {
            binding.tvResult2.text = getString(string.obr1)
            binding.mark.setImageResource(drawable.exclaimation)
            binding.tvTips.text = getString(string.obr2)
            binding.Tips1.text = getString(string.ob1)
            binding.Tips2.text = getString(string.ob2)
            binding.Tips3.text = getString(string.ob3)
            binding.Tips4.text = getString(string.ob4)
            binding.Tips5.text = getString(string.ob5)
        }
    }
}

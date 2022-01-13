package com.appsbyshivam.bmicalc

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsbyshivam.bmicalc.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lottieFileLink.setOnClickListener {
            val lottieURL = "https://www.lottiefiles.com"
            val intentLottieSite = Intent(Intent.ACTION_VIEW)
            intentLottieSite.data = Uri.parse(lottieURL)
            startActivity(intentLottieSite)
        }
        binding.privacyLink.setOnClickListener {
            val intentP = Intent(this, PrivacyPolicyActivity::class.java)
            startActivity(intentP)
        }
        binding.termsLink.setOnClickListener {
            val intentC = Intent(this, TermsConditionActivity::class.java)
            startActivity(intentC)
        }
        binding.siteLink.setOnClickListener {
            val siteURL = "https://bmicalc-0.flycricket.io"
            val intentSite = Intent(Intent.ACTION_VIEW)
            intentSite.data = Uri.parse(siteURL)
            startActivity(intentSite)
        }

    }
}
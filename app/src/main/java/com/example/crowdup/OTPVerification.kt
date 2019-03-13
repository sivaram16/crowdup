package com.example.crowdup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_otp_verification.*

class OTPVerification : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verification)
        setOnClickListener()
    }
    fun setOnClickListener(){
        Verifying.setOnClickListener {
            startActivity(Intent(this, GoodToGoActivity::class.java))
        }
    }
}


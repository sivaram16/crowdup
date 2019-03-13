package com.example.crowdup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        setOnClickListener()
    }

    fun setOnClickListener(){
        signUp.setOnClickListener {
            startActivity(Intent(this, OTPVerification::class.java))
        }
    }
}


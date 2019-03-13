package com.example.crowdup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_good_to_go.*

class GoodToGoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good_to_go)
        setOnClickListener()
    }
    fun setOnClickListener() {
        continueButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}



package com.example.crowdup.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.crowdup.Alumni
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {
    private var firebaseauth:FirebaseAuth?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.crowdup.R.layout.activity_login)
        firebaseauth = FirebaseAuth.getInstance()
        setOnClickListener()
    }
    fun setOnClickListener() {
        signIn.setOnClickListener {
            val intent = Intent(this, Alumni::class.java)
            startActivity(intent)
        }
    }
}

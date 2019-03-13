package com.example.crowdup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setOnClickListener()
    }
    fun setOnClickListener(){
        profileBack.setOnClickListener{
            startActivity(Intent(this, Alumni::class.java))
        }
        EditPersonalInformation.setOnClickListener{
            startActivity((Intent(this, PersonalActivity::class.java)))
        }
        editEducationalInformation.setOnClickListener{
            startActivity(Intent(this, EducationActivity::class.java))
        }
        addBusiness.setOnClickListener{
            startActivity(Intent(this, ProfessionActivity::class.java))
        }
        addYourInterests.setOnClickListener{
            startActivity(Intent(this,InterestsActivity::class.java))
        }
    }
}


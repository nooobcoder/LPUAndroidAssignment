package com.example.continuousassessmentone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hiding the title bar
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }


        val btnQuestionOne: Button = findViewById<Button>(R.id.main_scr_btn_one)
        val btnQuestionTwo: Button = findViewById<Button>(R.id.main_scr_btn_two)

        btnQuestionOne.setOnClickListener { goToQuestionOne() }
        btnQuestionTwo.setOnClickListener { goToQuestionTwo() }
    }

    fun goToQuestionOne() {
        startActivity(Intent(this@MainActivity, QuestionOne::class.java))
    }

    fun goToQuestionTwo() {
        startActivity(Intent(this@MainActivity, QuestionTwo::class.java))
    }
}
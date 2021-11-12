package com.example.continuousassessmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.NullPointerException

class QuestionTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Hiding the title bar
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_question_two)
    }
}
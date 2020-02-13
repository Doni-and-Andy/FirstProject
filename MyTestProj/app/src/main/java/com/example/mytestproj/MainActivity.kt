package com.example.mytestproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)

        val pressButton = findViewById<Button>(R.id.pressButton)
        val text = "Button clicked!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)

        //TODO: Remove unnecessary parenthesis = Completed
        pressButton.setOnClickListener { toast.show() }


        // TODO: Add a second button. This button (you can use the button that you just added) opens a new activity which contains Textview that shows "Second Activity"
        val goSecondActivity = findViewById<Button>(R.id.goSecondActivity)
        goSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }
        // TODO: Also add a button on the second activity to go back to the first activity - you can add a TextView to the first activity ("First Activity") = Completed
    }
}
package com.example.mytestproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.analytics.FirebaseAnalytics



class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)

        // TODO: Exercise 1 -> Add a new button. Button will show a Toast message "Button clicked!"x1
        val pressButton = findViewById<Button>(R.id.pressButton)
        val text = "Button clicked!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)

        pressButton.setOnClickListener() { toast.show() }
    }
}

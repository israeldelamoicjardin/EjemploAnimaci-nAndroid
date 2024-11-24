package com.hoang.daniwebanimatespritesanimationdrawable

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val santaImage = findViewById<ImageView>(R.id.image_santa)

        // Add Button IDs and Animation IDs into map for easy looping.
        val animationMap = mapOf(
            Pair(R.id.idle, R.drawable.idle)

        )

        for ((buttonId, animationId) in animationMap){
            findViewById<Button>(buttonId).setOnClickListener {
                santaImage.setImageResource(animationId)
                (santaImage.drawable as AnimationDrawable).start()
            }
        }
    }
}
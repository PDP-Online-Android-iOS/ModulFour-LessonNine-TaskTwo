package dev.ogabek.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.iv_main)

        val animation = AnimationUtils.loadAnimation(this, R.anim.sequential)

        imageView.startAnimation(animation)

        imageView.setOnClickListener {
            imageView.startAnimation(animation)
        }

    }
}
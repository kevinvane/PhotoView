package com.github.chrisbanes.photoview.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import com.github.chrisbanes.photoview.PhotoView

class CoilSampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        val photoView = findViewById<PhotoView>(R.id.iv_photo)
        photoView.load("http://img.daimg.com/uploads/allimg/230618/3-23061R12333.jpg") {
            crossfade(true)
        }
    }
}

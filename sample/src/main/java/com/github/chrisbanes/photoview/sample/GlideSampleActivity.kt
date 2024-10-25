package com.github.chrisbanes.photoview.sample

import android.os.Bundle
import android.view.View
import android.widget.ImageView.ScaleType
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoView

class GlideSampleActivity : AppCompatActivity() {
    private lateinit var photoView: PhotoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        photoView = findViewById<PhotoView>(R.id.iv_photo)

        Glide.with(this)
            // .load("http://img.daimg.com/uploads/allimg/230618/3-23061R12333.jpg")
            .load("http://192.168.0.197/1.jpg")
            .into(photoView)

        photoView.setOnMatrixChangeListener {
            println("matrix top: ${it.top}")
            // 记录偏移量，退出Activity再次显示的时候，设置偏移量
            LauncherActivity.moveTop = it.top
        }
        // photoView.setOffsetCrop(0f, LauncherActivity.moveTop)
        photoView.setCenterCropOffset(0f, LauncherActivity.moveTop)
        photoView.scaleType = ScaleType.CENTER_CROP
        // photoView.scaleType = ScaleType.FIT_CENTER

    }

    fun moveClick(v: View){
        photoView.setTranslate(0f,100f)
    }
    fun centerClick(v: View){
        photoView.setCenterCropOffset(0f, LauncherActivity.moveTop)
        photoView.scaleType = ScaleType.CENTER_CROP
    }
    fun fitClick(v: View){
        photoView.scaleType = ScaleType.FIT_CENTER
    }
}
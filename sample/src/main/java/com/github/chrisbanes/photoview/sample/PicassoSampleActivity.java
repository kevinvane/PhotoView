package com.github.chrisbanes.photoview.sample;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

public class PicassoSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        final PhotoView photoView = findViewById(R.id.iv_photo);

        Picasso.with(this)
                .load("http://img.daimg.com/uploads/allimg/230618/3-23061R12333.jpg")
                .into(photoView);
    }
}

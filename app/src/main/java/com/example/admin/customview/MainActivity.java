package com.example.admin.customview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SlideView slideView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideView = (SlideView) findViewById(R.id.sliderView);
        slideView.setListener(new SlideView.SliderListener() {
            @Override
            public void onSlide(float progress, SliderState state) {
                switch (state) {
                    case OPENED:
                        startActivity(new Intent(MainActivity.this, SecondActivity.class));
                }
            }
        });
    }
}

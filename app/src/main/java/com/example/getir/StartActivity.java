package com.example.getir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;

public class StartActivity extends AppCompatActivity {

    RelativeLayout animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        animation = findViewById(R.id.start_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent = new Intent(StartActivity.this, NextActivity.class);
                    startActivity(intent);
                    finish();
            }
        },1800);
    }
}
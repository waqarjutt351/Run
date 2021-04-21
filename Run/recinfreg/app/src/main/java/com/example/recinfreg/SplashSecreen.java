package com.example.recinfreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashSecreen extends AppCompatActivity {
    private static int Splash_TimeOut=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_secreen);
        new Handler().postDelayed(new Runnable(){


            @Override
            public void run() {
                Intent homeintent = new Intent(SplashSecreen.this,RegisterActivity.class);

            }
        }
    }
}
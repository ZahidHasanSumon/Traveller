package com.zh.mynews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;

public class SplashScreen extends AppCompatActivity {
    private Window window;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>=21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.white));
        }
        setContentView(R.layout.activity_splash_screen);
        final Handler handler = new Handler(Looper.myLooper());


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();

            }
        }, 1000);
    }
}
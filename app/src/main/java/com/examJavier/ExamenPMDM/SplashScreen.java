package com.examJavier.ExamenPMDM;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_splash_screen);

        int splashDuration = 3000;

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, login.class);
            startActivity(intent);
            finish();
        },splashDuration);
    }
}
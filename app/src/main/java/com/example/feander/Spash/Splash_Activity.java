package com.example.feander.Spash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.feander.R;
import com.example.feander.SignInAndUp.SignIn_Activity;

public class Splash_Activity extends AppCompatActivity {
final int SPLASH_TIME = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Activity.this, SignIn_Activity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
    }
}

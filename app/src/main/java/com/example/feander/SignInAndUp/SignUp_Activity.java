package com.example.feander.SignInAndUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.feander.R;

public class SignUp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);
    }

    public void openSignIn(View view) {
        Intent intent = new Intent(this, SignIn_Activity.class);
        startActivity(intent);
    }
}

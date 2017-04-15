package com.example.apple.medizone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Resictration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resictration);
    }
    public void login(View view)
    {
        finish();
        startActivity(new Intent(this, Login.class));
    }
    public void signupwithmedzone(View view)
    {
        finish();
        startActivity(new Intent(this,SignUp.class));
    }
}

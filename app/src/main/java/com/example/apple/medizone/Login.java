package com.example.apple.medizone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view)
    {
        finish();
        startActivity(new Intent(this,Home.class));
    }
    public void signup(View view)
    {
        finish();
        startActivity(new Intent(this,Resictration.class));
    }
}

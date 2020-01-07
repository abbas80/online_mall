package com.example.mall;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SystemClock.sleep(3000);
        Intent intent=new Intent(splash.this,registor.class);
        startActivity(intent);
        finish();
    }
}

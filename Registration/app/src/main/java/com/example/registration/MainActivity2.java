package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvlogin = (TextView) findViewById(R.id.welcome);

        Intent i = getIntent();
        String a = i.getStringExtra("username");
        tvlogin.setText("Welcome: "+ a);
    }
}
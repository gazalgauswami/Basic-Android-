package com.example.changecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button red,green,yellow,black;
    TextView textView;
    View lyout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.btnred);
        green = findViewById(R.id.btngrren);
        yellow = findViewById(R.id.btnyellow);
        black = findViewById(R.id.btnblack);
        textView = findViewById(R.id.txtshow);
        lyout = findViewById(R.id.lyout);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.WHITE);
                lyout.setBackgroundColor(Color.RED);

            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.RED);
                lyout.setBackgroundColor(Color.GREEN);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.BLACK);
                textView.setBackgroundColor(Color.RED);
                lyout.setBackgroundColor(Color.YELLOW);
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.WHITE);
                lyout.setBackgroundColor(Color.BLACK);
            }
        });
    }
}
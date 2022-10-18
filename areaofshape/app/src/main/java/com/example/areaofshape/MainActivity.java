package com.example.areaofshape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button cir,tri,rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            cir = findViewById(R.id.btncir);
            tri = findViewById(R.id.btntri);
            rec = findViewById(R.id.btnrec);

            cir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }
            });
            tri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(i);
                }
            });
            rec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(i);
                }
            });
    }
}
package com.example.areaofshape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button,button1;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.btncir);
        editText = findViewById(R.id.edr);
        textView = findViewById(R.id.txtcirans);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals("")&&!editText.getText().toString().equals("")){
                    Toast.makeText(MainActivity2.this, "Fill Field", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int e1 = Integer.parseInt(editText.getText().toString());
                    int res = int(e1*e1*Math.PI);
                    textView.setText("Answer: "+res);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
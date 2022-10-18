package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText one,two,answer;
    Button plus,minus,div,multi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.edone);
        two = findViewById(R.id.edtwo);
        answer = findViewById(R.id.edans);
        plus = findViewById(R.id.btnplus);
        minus = findViewById(R.id.btnminus);
        div = findViewById(R.id.btndiv);
        multi = findViewById(R.id.btnmul);

        String e1= one.getText().toString();
        String e2 = two.getText().toString();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(one.getText().toString().equals("")&&two.getText().toString().equals("")||one.getText().toString().equals("")&&!two.getText().toString().equals("")||!one.getText().toString().equals("")&&two.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Both Feild", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int n1 = Integer.parseInt(e1);
                    int n2 = Integer.parseInt(e2);
                    int res = n1+n2;
                    answer.setText("Answer: "+ res);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.equals("")&&e2.equals("")||!e1.equals("")&&e2.equals("")||e1.equals("")&&!e2.equals("")){
                    Toast.makeText(MainActivity.this, "Fill Both Feild", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int n1 = Integer.parseInt(e1);
                    int n2 = Integer.parseInt(e2);
                    int res = n1-n2;
                    answer.setText("Answer: "+ res);
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.equals("")&&e2.equals("")||!e1.equals("")&&e2.equals("")||e1.equals("")&&!e2.equals("")){
                    Toast.makeText(MainActivity.this, "Fill Both Feild", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int n1 = Integer.parseInt(e1);
                    int n2 = Integer.parseInt(e2);
                    int res = n1*n2;
                    answer.setText("Answer: "+ res);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.equals("")&&e2.equals("")||!e1.equals("")&&e2.equals("")||e1.equals("")&&!e2.equals("")){
                    Toast.makeText(MainActivity.this, "Fill Both Feild", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int n1 = Integer.parseInt(e1);
                    int n2 = Integer.parseInt(e2);
                    int res = n1/n2;
                    answer.setText("Answer: "+ res);
                }
            }
        });
    }
}
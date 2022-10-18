package com.example.areaofshape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button pre,ans;
    EditText one,two;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        pre = findViewById(R.id.btnpre);
        ans = findViewById(R.id.btnnext);
        one = findViewById(R.id.edl);
        two = findViewById(R.id.edb);
        answer = findViewById(R.id.txtans);

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this,MainActivity.class);
                startActivity(i);
            }
        });

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(one.getText().toString().equals("")&&two.getText().toString().equals("")||!one.getText().toString().equals("")&&two.getText().toString().equals("")||one.getText().toString().equals("")&&!two.getText().toString().equals("")){
                    Toast.makeText(MainActivity4.this, "Fill Both Field", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int e1 = Integer.parseInt(one.getText().toString());
                    int e2 = Integer.parseInt(two.getText().toString());
                    double res = e1*e2;
                    answer.setText("Answer: "+res);
                }

            }
        });
    }
}
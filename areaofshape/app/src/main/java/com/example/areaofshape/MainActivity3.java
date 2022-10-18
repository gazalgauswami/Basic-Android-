package com.example.areaofshape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText one,two;
    TextView answer;
    Button pre,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        one = findViewById(R.id.edb);
        two = findViewById(R.id.edh);
        answer = findViewById(R.id.txtans);
        pre = findViewById(R.id.btnpre);
        ans = findViewById(R.id.btnnext);

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(one.getText().toString().equals("")&&two.getText().toString().equals("")||!one.getText().toString().equals("")&&two.getText().toString().equals("")||one.getText().toString().equals("")&&!two.getText().toString().equals("")){
                    Toast.makeText(MainActivity3.this, "Fill All Feield", Toast.LENGTH_SHORT).show();
                }
                else{
                    int e1 = Integer.parseInt(one.getText().toString());
                    int e2 = Integer.parseInt(two.getText().toString());
                    double res = e1*e2*0.5;
                    answer.setText("Answer: "+res);
                }
            }
        });
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

}
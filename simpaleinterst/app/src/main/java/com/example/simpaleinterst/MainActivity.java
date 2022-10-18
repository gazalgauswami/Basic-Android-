package com.example.simpaleinterst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText p,r,n;
    TextView answer;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p = findViewById(R.id.edp);
        r = findViewById(R.id.edr);
        n = findViewById(R.id.edn);
        answer = findViewById(R.id.txtans);
        ok = findViewById(R.id.btnok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(p.getText().toString().equals("")&&r.getText().toString().equals("")&&n.getText().toString().equals("")||!p.getText().toString().equals("")&&r.getText().toString().equals("")&&n.getText().toString().equals("")||p.getText().toString().equals("")&&!r.getText().toString().equals("")&&n.getText().toString().equals("")||p.getText().toString().equals("")&&r.getText().toString().equals("")&&!n.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Fill All Fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int n1 = Integer.parseInt(p.getText().toString());
                    int n2 = Integer.parseInt(r.getText().toString());
                    int n3 = Integer.parseInt(n.getText().toString());

                    int res = (n1+n2+n3)/100;

                    answer.setText("Answer: "+res);
                }
            }
        });
    }
}
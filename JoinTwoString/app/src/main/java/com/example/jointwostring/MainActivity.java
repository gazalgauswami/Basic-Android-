package com.example.jointwostring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText one,two;
    TextView answer;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    one = findViewById(R.id.edone);
    two = findViewById(R.id.edone2);
    answer = findViewById(R.id.txtans);
    button = findViewById(R.id.btnchange);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(one.getText().toString().equals("")&&two.getText().toString().equals("")||!one.getText().toString().equals("")&&two.getText().toString().equals("")||one.getText().toString().equals("")&&!two.getText().toString().equals(""))
            {
                Toast.makeText(MainActivity.this, "Fill Both Fields", Toast.LENGTH_SHORT).show();
            }
            else{
                String a = one.getText().toString();
                String b = two.getText().toString();
                answer.setText("Join: "+a+"  "+b);
            }
        }
    });
    }
}
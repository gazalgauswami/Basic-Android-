package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button login,rege;
    EditText password,cpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        login = (Button) findViewById(R.id.btnlogin);
        rege = (Button) findViewById(R.id.btnrej);
        password = (EditText)findViewById(R.id.etpassword);
        cpassword = (EditText) findViewById(R.id.etcpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(i);
            }
        });
        rege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals(cpassword.getText().toString()) && cpassword.getText().toString().equals(password.getText().toString())) {

                    Toast.makeText(MainActivity3.this, "Successfully registration", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity3.this, "Enter Correct Password", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
package com.example.singaleregestrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,sname,email,birth;
    RadioGroup rggroup;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = findViewById(R.id.edfname);
        sname = findViewById(R.id.edsname);
        email = findViewById(R.id.edemail);
        birth = findViewById(R.id.edbirth);
        rggroup = findViewById(R.id.rggroup);
        button = findViewById(R.id.btnpass);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean efname = fname.getText().toString().equals("");
                boolean esname = sname.getText().toString().equals("");
                boolean eemail = email.getText().toString().equals("");
                boolean ebirth = birth.getText().toString().equals("");

                if(efname&&esname&&eemail&&ebirth||!efname&&esname&&eemail&&ebirth||efname&&!esname&&eemail&&ebirth||efname&&esname&&!eemail&&ebirth||efname&&esname&&eemail&&!ebirth){
                    Toast.makeText(MainActivity.this, "Fill All fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Successfully registration", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
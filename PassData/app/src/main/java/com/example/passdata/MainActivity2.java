package com.example.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView fname,sname,email,birth,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fname = findViewById(R.id.txtfname);
        sname = findViewById(R.id.txtsname);
        email = findViewById(R.id.txtemail);
        birth = findViewById(R.id.txtbirth);
        gender = findViewById(R.id.txtgender);

        Intent i = getIntent();

        String  a= i.getStringExtra("fname");
        fname.setText("Fname: "+ a);
        String b = i.getStringExtra("sname");
        sname.setText("Sname: "+b);
        String c = i.getStringExtra("email");
        email.setText("Email: "+c);
        String d = i.getStringExtra("Birth");
        birth.setText("Birth: "+d);
        String egender = i.getStringExtra("Gender");
        gender.setText("Gender: "+egender);
    }
}
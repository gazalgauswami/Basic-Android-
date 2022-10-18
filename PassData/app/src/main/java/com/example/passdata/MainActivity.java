package com.example.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pass;
    EditText fname,sname,email,birth;
    RadioGroup rggroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    pass = findViewById(R.id.btnpass);
    fname = findViewById(R.id.edfname);
    sname = findViewById(R.id.edsname);
    email = findViewById(R.id.edemail);
    birth = findViewById(R.id.edbirth);
    rggroup = findViewById(R.id.rggroup);
    

    pass.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        if(fname.getText().toString().equals("")&&sname.getText().toString().equals("")&&email.getText().toString().equals("")&&birth.getText().toString().equals("")||!fname.getText().toString().equals("")&&sname.getText().toString().equals("")&&email.getText().toString().equals("")&&birth.getText().toString().equals("")||fname.getText().toString().equals("")&&!sname.getText().toString().equals("")&&email.getText().toString().equals("")&&birth.getText().toString().equals("")||fname.getText().toString().equals("")&&sname.getText().toString().equals("")&&!email.getText().toString().equals("")&&birth.getText().toString().equals("")||fname.getText().toString().equals("")&&sname.getText().toString().equals("")&&email.getText().toString().equals("")&&!birth.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Fill All Fields", Toast.LENGTH_SHORT).show();
        }
        else
        {
            radioButton = rggroup.findViewById(rggroup.getCheckedRadioButtonId());
            String data = radioButton.getText().toString();

            String efname = fname.getText().toString();
            String esname = sname.getText().toString();
            String eemail = email.getText().toString();
            String ebirth = birth.getText().toString();

            Intent i = new Intent(MainActivity.this,MainActivity2.class);
            i.putExtra("fname",efname);
            i.putExtra("sname",esname);
            i.putExtra("email",eemail);
            i.putExtra("Birth",ebirth);
            i.putExtra("Gender",data);
            startActivity(i);
            Toast.makeText(MainActivity.this, "Send data Sucessfully", Toast.LENGTH_SHORT).show();
        }

        }
    });
    }
}
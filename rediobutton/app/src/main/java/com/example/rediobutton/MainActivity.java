package com.example.rediobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioGroup rbgroup;
    RadioButton rbbca,rbbba,rbbcom;
    String status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        rbgroup =(RadioGroup) findViewById(R.id.rbgroup);
        rbbca = (RadioButton) findViewById(R.id.rbbca);
        rbbba = (RadioButton) findViewById(R.id.rbbba);
        rbbcom = (RadioButton) findViewById(R.id.rbbcom);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbbca.isChecked()){
                    status=rbbca.getText().toString();

                }
                else if(rbbba.isChecked()){
                    status=rbbba.getText().toString();
                }
                else
                {
                    status=rbbcom.getText().toString();
                }
                Toast.makeText(getApplicationContext(), status, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
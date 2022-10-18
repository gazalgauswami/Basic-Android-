package com.example.togglebuttonwithtitlebar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        hide = findViewById(R.id.tbtitle);



        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hide.isChecked()){
                    getSupportActionBar().hide();
                }
                else{
                    getSupportActionBar().show();
                }
            }
        });
    }
}
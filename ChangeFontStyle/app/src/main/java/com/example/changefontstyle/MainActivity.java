package com.example.changefontstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edtext);
        button = findViewById(R.id.btnchange);
        textView = findViewById(R.id.txt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals("")&&!editText.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Fill Feield", Toast.LENGTH_SHORT).show();
                }
                else{
                    String a = editText.getText().toString();
                    textView.setText("Change: "+a);
                    textView.setTextColor(Color.RED);
                    textView.setBackgroundColor(Color.YELLOW);
                    textView.setTextSize(36);
                }
            }
        });
    }
}
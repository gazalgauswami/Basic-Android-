package com.example.radiocalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText one,two;
    TextView textView;
    RadioGroup rggroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.edone);
        two = findViewById(R.id.edtwo);
        textView = findViewById(R.id.txtans);
        rggroup = findViewById(R.id.rbgroup);

        rggroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int n1 = Integer.parseInt(one.getText().toString());
                int n2 = Integer.parseInt(two.getText().toString());
                int res;

                switch (i){
                    case R.id.rbplus:
                        res = n1+n2;
                        textView.setText("Answer: "+res);
                        break;
                    case R.id.rbminus:
                        res = n1-n2;
                        textView.setText("Answer: "+res);
                        break;
                    case R.id.rbmulti:
                        res=n1*n2;
                        textView.setText("Answer: "+res);
                        break;
                    case R.id.rbdiv:
                        res=n1/n2;
                        textView.setText("Answer: "+res);
                        break;

                }
            }
        });
    }
}
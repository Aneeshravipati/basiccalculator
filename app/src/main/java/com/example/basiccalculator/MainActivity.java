package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1,t2,t3;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=Double.parseDouble(e1.getText().toString());
                double input2=Double.parseDouble(e2.getText().toString());

                double result = input1+input2;
                t3.setText(Double.toString(result));


            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=Double.parseDouble(e1.getText().toString());
                double input2=Double.parseDouble(e2.getText().toString());

                double result = input1-input2;
                t3.setText(Double.toString(result));


            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=Double.parseDouble(e1.getText().toString());
                double input2=Double.parseDouble(e2.getText().toString());

                double result = input1*input2;
                t3.setText(Double.toString(result));


            }

        });b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1=Double.parseDouble(e1.getText().toString());
                double input2=Double.parseDouble(e2.getText().toString());

                double result = input1/input2;
                t3.setText(Double.toString(result));


            }

        });

    }
}
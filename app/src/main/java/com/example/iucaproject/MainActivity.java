package com.example.iucaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView result;
    EditText input1, input2;
    Button add, mul, sub, div, equ;
    int num1, num2;
    int result_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input1 = (EditText) findViewById(R.id.editText1);
        input2 = (EditText) findViewById(R.id.editText2);

        add = (Button) findViewById(R.id.buttonAdd);
        sub = (Button) findViewById(R.id.buttonSub);
        mul = (Button) findViewById(R.id.buttonMul);
        div = (Button) findViewById(R.id.buttonDiv);
        equ = (Button) findViewById(R.id.buttonEqu);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result_num = num1 + num2;


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result_num = num1 - num2;

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result_num = num1 * num2;

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());
                result_num = num1 / num2;

            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input1.getText().toString());
                num2 = Integer.parseInt(input2.getText().toString());

                Intent i = new Intent(MainActivity.this, Activity2.class);
                i.putExtra("key", result_num);
                startActivity(i);


            }
        });


    }


}

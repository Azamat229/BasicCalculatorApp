package com.example.iucaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("key", 0);


        TextView textView1 = (TextView) findViewById(R.id.TextOfResult2);
//        textView1.setText(intValue);
        textView1.setText(String.valueOf(intValue));



    }
}
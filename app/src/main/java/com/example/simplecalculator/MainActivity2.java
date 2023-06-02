package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //textView = (TextView) findViewById(R.id.textRst);

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("First Number:");
        String value2 = extras.getString("Second Number:");
        int value3 = extras.getInt("Summation Result:");
        //Toast.makeText(getApplicationContext(), "Values are: /n First value: " + value1 + "/n Second value: " + value2);

        textView.setText(String.valueOf(value3));
    }
}
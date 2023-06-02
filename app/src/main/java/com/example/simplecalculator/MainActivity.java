package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text1, text2;
    private TextView textRst;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.textFirst);
        text2 = (EditText) findViewById(R.id.textSecond);
        textRst = (TextView) findViewById(R.id.textResult);
        btn = (Button) findViewById(R.id.submitButton);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String value1 = text1.getText().toString();
        String value2 = text2.getText().toString();
        int a = Integer.parseInt(value1);
        int b = Integer.parseInt(value2);
        int sum = a + b;
        Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
        //textRst.setText(String.valueOf(sum));
    }

    public void callSecondActivity(View view) {
        String value1 = text1.getText().toString();
        String value2 = text2.getText().toString();
        int a = Integer.parseInt(value1);
        int b = Integer.parseInt(value2);
        int sum = a + b;

        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("First Number:", value1);
        i.putExtra("Second Number:", value2);
        i.putExtra("Summation Result:", sum);
        // set the request code to any code you like, you can identify the callback via this code
        startActivity(i);
    }
}
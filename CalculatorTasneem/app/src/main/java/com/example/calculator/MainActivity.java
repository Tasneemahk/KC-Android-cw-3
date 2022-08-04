package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String calculator = "calculator";
        TextView firstNumberLabel = findViewById(R.id.FirstNumber);
        TextView secondNumberLabel = findViewById(R.id.SecondNumber);
        TextView title = findViewById(R.id.Title);
        TextView thankYou = findViewById(R.id.Thankyou);
        TextView firstNumberInput = findViewById(R.id.frst);
        TextView secondNumberInput = findViewById(R.id.scnd);
        Button addition = findViewById(R.id.Addition);
        Button multiplication = findViewById(R.id.Multiplication);
        Button subtraction = findViewById(R.id.Subtraction);
        Button division = findViewById(R.id.Division);
        Button calculate = findViewById(R.id.calculate);
    }
}
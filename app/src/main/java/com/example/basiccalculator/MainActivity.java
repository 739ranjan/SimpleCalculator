package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFirst,editTextSecond;
    private TextView textViewAns;
    public Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirst = findViewById(R.id.editTextFirst);
        editTextSecond = findViewById(R.id.editTextSecond);
        textViewAns = findViewById(R.id.textViewAns);

    }

    public void onClickAdd(View view) {
        String s1 = editTextFirst.getText().toString();
        String s2 = editTextSecond.getText().toString();
        double res = (Double.parseDouble(s1))+(Double.parseDouble(s2));
        textViewAns.setText(""+res);
    }

    public void onClickSub(View view) {
        String s1 = editTextFirst.getText().toString();
        String s2 = editTextSecond.getText().toString();
        double res =(Double.parseDouble(s1))-(Double.parseDouble(s2));
        textViewAns.setText(""+res);
    }

    public void onClickMul(View view) {
        String s1 = editTextFirst.getText().toString();
        String s2 = editTextSecond.getText().toString();
        double res = (Double.parseDouble(s1))*(Double.parseDouble(s2));
        textViewAns.setText(""+res);
    }

    public void onClickDiv(View view) {
        String s1 = editTextFirst.getText().toString();
        String s2 = editTextSecond.getText().toString();
        double res = (Double.parseDouble(s1))/(Double.parseDouble(s2));
        textViewAns.setText(""+res);
    }

}
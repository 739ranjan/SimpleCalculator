package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView textViewP;
    private ProgressBar progressBar;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textViewP = findViewById(R.id.textViewP);
        progressBar = findViewById(R.id.progressBar);

        Thread thread =new Thread(new Runnable(){
            @Override
            public void run() {
                startProgress();
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    thread.start();
    }

    public void startProgress(){
        for(i=0;i<=100;i++){
            try {
                Thread.sleep(10);
                textViewP.setText(""+i+" %");
                progressBar.setProgress(i);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
package com.example.linkinpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,songList.class);
                startActivity(i);
            }
        };
        Timer splash = new Timer();
        splash.schedule(tt,5000);
    }
}
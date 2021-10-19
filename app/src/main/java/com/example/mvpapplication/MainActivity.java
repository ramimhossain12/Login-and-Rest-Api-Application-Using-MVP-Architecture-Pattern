package com.example.mvpapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    private ProgressBar progressBar;
    private Button loginbutton;
    private EditText email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.emailEditID);
        pass = findViewById(R.id.PassEditID);
        loginbutton = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);
    }
}
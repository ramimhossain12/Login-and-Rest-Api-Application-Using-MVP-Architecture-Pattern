package com.example.mvpapplication.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mvpapplication.Presenter.ILoginPresenter;
import com.example.mvpapplication.Presenter.LoginOresentenerImple;
import com.example.mvpapplication.R;

public class MainActivity extends AppCompatActivity implements ILoginView{


    private ProgressBar progressBar;
    private Button loginbutton;
    private EditText email,pass;

    private ILoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.emailEditID);
        pass = findViewById(R.id.PassEditID);
        loginbutton = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);
       // progressBar.setProgress(View.VISIBLE);


        loginPresenter = new LoginOresentenerImple(this);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.dologin(email.getText().toString().trim(),pass.getText().toString().trim());

            }
        });


    }





    @Override
    public void onLoginSuccess(String msg) {

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onsetProgressBarVisibility(int visibility) {

        progressBar.setVisibility(visibility);
    }
}
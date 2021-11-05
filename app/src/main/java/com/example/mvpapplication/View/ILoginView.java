package com.example.mvpapplication.View;

public interface ILoginView {

    void onLoginSuccess(String msg);
    void onLoginError(String msg);
    void onsetProgressBarVisibility(int visibility);
}

package com.example.mvpapplication.Presenter;

import com.example.mvpapplication.Model.IUser;
import com.example.mvpapplication.Model.UserImpl;
import com.example.mvpapplication.View.ILoginView;

public class LoginOresentenerImple  implements  ILoginPresenter{


    private ILoginView loginView;

    public LoginOresentenerImple(ILoginView loginView) {
        this.loginView = loginView;
    }





    @Override
    public void dologin(String email, String pass) {

        IUser user = new UserImpl(email,pass);
        int login_code = user.checkUserValidity();


        if (login_code ==0){
            loginView.onLoginError("Please Enter your email");

        }else if(login_code ==1){
            loginView.onLoginError("Please Enter a valid email");
        }
        else if(login_code ==2){
            loginView.onLoginError("Please Enter your password");
        }
        else if(login_code ==3){
            loginView.onLoginError("Please Enter a password that should be more than 6 character");
        }
        else {
            loginView.onLoginSuccess("Login Successful");
        }

    }

    @Override
    public void setProgressVisiblity(int visiblity) {

        loginView.onsetProgressBarVisibility(visiblity);

    }
}

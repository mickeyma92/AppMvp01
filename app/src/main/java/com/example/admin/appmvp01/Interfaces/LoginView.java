package com.example.admin.appmvp01.Interfaces;

/**
 * Created by Admin on 20/04/2017.
 */

public interface LoginView {
    void showProgress();
    void hideProgress();

    void setErrorUser();
    void setErrorPassword();

    void navigateToHome();
}

package com.example.admin.appmvp01.Presenters;

import com.example.admin.appmvp01.Interactors.LoginInteractorImpl;
import com.example.admin.appmvp01.Interfaces.LoginInteractor;
import com.example.admin.appmvp01.Interfaces.LoginPresenter;
import com.example.admin.appmvp01.Interfaces.LoginView;
import com.example.admin.appmvp01.Interfaces.OnLoginFinishListener;

import java.security.PublicKey;

/**
 * Created by Admin on 20/04/2017.
 */

public class LoginPresenterImpl implements LoginPresenter,OnLoginFinishListener {
    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view){
        this.view=view;
        interactor= new LoginInteractorImpl();
    }

    @Override
    public void validarUsuario(String user, String pass) {
        if ( view != null){
            view.showProgress();
        }
        interactor.validaUser(user,pass,this);
    }

    @Override
    public void userNameError() {
        if (view != null){
            view.hideProgress();
            view.setErrorUser();
        }
    }

    @Override
    public void passwordError() {
        if (view != null){
            view.hideProgress();
            view.setErrorPassword();
        }
    }

    @Override
    public void exitoOperacion() {
        if (view != null){
            view.hideProgress();
            view.navigateToHome();
        }
    }
}

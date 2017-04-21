package com.example.admin.appmvp01.Interactors;



import android.os.Handler;

import com.example.admin.appmvp01.Interfaces.LoginInteractor;
import com.example.admin.appmvp01.Interfaces.OnLoginFinishListener;

/**
 * Created by Admin on 20/04/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void validaUser(final String user, final String pass, final OnLoginFinishListener listener) {
        new Handler().postDelayed(new  Runnable(){

            @Override
            public void run() {
                if (!user.equals("") && !pass.equals("")){
                        listener.exitoOperacion();
                }
                else {
                     if (user.equals("")){
                         listener.userNameError();
                     }
                     if (pass.equals("")){
                         listener.passwordError();
                     }
                }
            }
        },2000);
    }
}

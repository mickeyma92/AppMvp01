package com.example.admin.appmvp01.Interfaces;

/**
 * Created by Admin on 20/04/2017.
 */

public interface LoginInteractor {
    void validaUser(String user,String pass,OnLoginFinishListener listener);

}

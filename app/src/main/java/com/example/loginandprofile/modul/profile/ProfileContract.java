package com.example.loginandprofile.modul.profile;

import com.example.loginandprofile.base.BasePresenter;
import com.example.loginandprofile.base.BaseView;
import com.example.loginandprofile.modul.login.LoginContract;

public interface ProfileContract {
    interface View extends BaseView<LoginContract.Presenter> {
        void redirectToLogin();
    }

    interface Presenter extends BasePresenter {
        void showUsername(String email, String password);
        //void performLogin(String email, String password);
    }
}

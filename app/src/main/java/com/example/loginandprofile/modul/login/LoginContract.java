package com.example.loginandprofile.modul.login;

import com.example.loginandprofile.base.BasePresenter;
import com.example.loginandprofile.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile(String username, String Password);
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}

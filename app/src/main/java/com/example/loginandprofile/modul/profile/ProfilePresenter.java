package com.example.loginandprofile.modul.profile;

import com.example.loginandprofile.modul.login.LoginContract;

public class ProfilePresenter implements ProfileContract.Presenter {
    private final ProfileContract.View view;

    public ProfilePresenter(ProfileContract.View view) {
        this.view = view;
    }

    @Override
    public void showUsername(String email, String password) {
        view.redirectToLogin();
    }

    @Override
    public void start() {}
}

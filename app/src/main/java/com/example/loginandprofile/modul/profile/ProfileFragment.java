package com.example.loginandprofile.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.loginandprofile.R;
import com.example.loginandprofile.base.BaseFragment;
import com.example.loginandprofile.modul.login.*;
import com.example.loginandprofile.modul.login.LoginContract;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {
    String username;
    TextView tvUsername;

    public ProfileFragment(String username) {
        this.username = username;
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();
        tvUsername = fragmentView.findViewById(R.id.profileUsername);
        tvUsername.setText(username);
        setTitle("My Profile");

        return fragmentView;
    }

    @Override
    public void redirectToLogin() {
        Intent intent = new Intent(activity, LoginActivity.class);
        startActivity(intent);
        activity.finish();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }
}

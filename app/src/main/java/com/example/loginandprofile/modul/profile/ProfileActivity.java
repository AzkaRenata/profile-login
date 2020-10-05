package com.example.loginandprofile.modul.profile;

import android.content.Intent;
import android.view.View;

import com.example.loginandprofile.base.BaseFragmentHolderActivity;
import com.example.loginandprofile.modul.login.LoginFragment;

public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        profileFragment = new ProfileFragment(username);
        setCurrentFragment(profileFragment, false);
    }
}

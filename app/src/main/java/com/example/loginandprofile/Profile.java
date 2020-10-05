package com.example.loginandprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView usernameView = findViewById(R.id.profileUsername);
        usernameView.setText(username);
    }
}
package com.mcndemoandroid.profile.EditProfile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mcndemoandroid.R;

public class UserProfileActivity extends AppCompatActivity {
    TextView username, Email, Mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        username = findViewById(R.id.edit);
        Email = findViewById(R.id.edit2);
        Mobile = findViewById(R.id.edit3);

        String name, email, number;

        if (getIntent() != null) {

//            User user = getIntent().getParcelableExtra("user");

            name = getIntent().getStringExtra("username");
            email = getIntent().getStringExtra("email");
            number = getIntent().getStringExtra("mobile_no");


            username.setText(name);
            Email.setText(email);
            Mobile.setText(number);
        }
    }
}

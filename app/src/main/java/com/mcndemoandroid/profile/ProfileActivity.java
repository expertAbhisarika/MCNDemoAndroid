package com.mcndemoandroid.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mcndemoandroid.R;
//import com.mcndemoandroid.models.User;
import com.mcndemoandroid.profile.EditProfile.EditProfile;
import com.mcndemoandroid.profile.EditProfile.UserProfileActivity;
import com.mcndemoandroid.registration.RegistrationActivity;

//import static com.mcndemoandroid.CustomKeys.KEY_NAME;

public class ProfileActivity extends AppCompatActivity {

    TextView username, Email, Mobile;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        username = findViewById(R.id.edit);
        Email = findViewById(R.id.edit2);
        Mobile = findViewById(R.id.edit3);
        button = (Button) findViewById(R.id.btn);

        String name, email, number;
        name = getIntent().getStringExtra("username");
        email = getIntent().getStringExtra("email");
        number = getIntent().getStringExtra("mobile_no");
        username.setText(name);
        Email.setText(email);
        Mobile.setText(number);


    }

    public void callEditProfile(View view) {
        String s1, s2, a;
        a = username.getText().toString();
        s1 = Email.getText().toString();
        s2 = Mobile.getText().toString();
        Intent intent = new Intent(ProfileActivity.this, EditProfile.class);

        intent.putExtra("username", a);
        intent.putExtra("email", s1);
        intent.putExtra("mobile_no", s2);
        startActivityForResult(intent, 2);
//        Intent i = new Intent(getApplicationContext(), EditProfile.class);
//        startActivityForResult(i, 1);
    }

    //
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // check that it is the SecondActivity with an OK result
        if (requestCode == 2) {
            if (data != null) {
                String a = data.getStringExtra("username");
                String s1 = data.getStringExtra("email");
                String s2 = data.getStringExtra("mobile_no");
                username.setText(a);
                Email.setText(s1);
                Mobile.setText(s2);
            }
        }
    }
}
//



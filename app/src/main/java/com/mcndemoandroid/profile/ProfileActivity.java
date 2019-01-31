package com.mcndemoandroid.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mcndemoandroid.R;

public class ProfileActivity extends AppCompatActivity {

    TextView username,Email,Mobile;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        username =  findViewById(R.id.edit);
        Email =  findViewById(R.id.edit2);
        Mobile =  findViewById(R.id.edit3);
        button=(Button)findViewById(R.id.btn);

    }

    public void callProfile(View view) {
        String s = username.getText().toString();
        String s1 = Email.getText().toString();
        String s2 = Mobile.getText().toString();
        // Creating Intent Object
        Intent intent=new Intent();
        String name=getIntent().getStringExtra("firstname");
        String email=getIntent().getStringExtra("email");
        String mobile=getIntent().getStringExtra("mobile_no");
        username.setText(name);
        Email.setText(email);
        Mobile.setText(mobile);

        Toast.makeText(ProfileActivity.this, "Updation Successful", Toast.LENGTH_LONG).show();
    }
}

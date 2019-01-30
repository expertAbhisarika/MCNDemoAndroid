package com.mcndemoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
TextView firstnameEdt,emailEdt,numberEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        firstnameEdt=findViewById(R.id.first_name);
        emailEdt=findViewById(R.id.email);
        numberEdt=findViewById(R.id.mobile_no);
        String name,email,number;
       //if (getIntent() != null) {
           name = getIntent().getStringExtra("firstname");
           email = getIntent().getStringExtra("email");
           number = getIntent().getStringExtra("mobile no");
           firstnameEdt.setText(name);
       emailEdt.setText(email);
       numberEdt.setText(number);

    }

}

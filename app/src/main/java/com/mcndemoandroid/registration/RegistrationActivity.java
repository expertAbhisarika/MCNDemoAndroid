package com.mcndemoandroid.registration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.mcndemoandroid.ProfileActivity;
import com.mcndemoandroid.R;

import java.util.regex.Matcher;

public class RegistrationActivity extends AppCompatActivity {
    EditText firstname, lastname, email_id, pass, conf_pass, number;
    RadioButton male, female;
    Button login;
    RadioGroup radioGroup;
    Matcher m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        firstname = (EditText) findViewById(R.id.first_name);
        lastname = (EditText) findViewById(R.id.last_name);
        email_id = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);
        conf_pass = (EditText) findViewById(R.id.confirm_pass);
        number = (EditText) findViewById(R.id.mobile_no);
        male = (RadioButton) findViewById(R.id.malerdo);
        female = (RadioButton) findViewById(R.id.femalerdo);
        login = (Button) findViewById(R.id.loginbtn);

    }
    public void callProfile(View view) {

        String s, s1, s2, s3, s4, s5, s6, s7;
        s = firstname.getText().toString();
        s1 = lastname.getText().toString();
        s2 = email_id.getText().toString();
        s3 = pass.getText().toString();
        s4 = conf_pass.getText().toString();
        s5 = number.getText().toString();
        s6 = male.getText().toString();
        s7 = female.getText().toString();

//        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (s.length() == 0) {
            firstname.requestFocus();
            firstname.setError("This field cannot be empty");
        }
        if (s1.length() == 0) {
            lastname.requestFocus();
            lastname.setError("This field cannot be empty");
        }
        if (s2.length() == 0) {
            email_id.requestFocus();
            email_id.setError("This field cannot be empty");
        }
        if (s3.length() == 0) {
            pass.requestFocus();
            pass.setError("This field cannot be empty");
        }
        if (s4.length() == 0) {
            conf_pass.requestFocus();
            conf_pass.setError("This field cannot be empty");
        }
        if (s5.length() == 0) {
            number.requestFocus();
            number.setError("This field cannot be empty");
        } else {
            Toast.makeText(RegistrationActivity.this, "registered successfully", Toast.LENGTH_LONG).show();


            // Creating Intent Object
            Intent intent = new Intent(RegistrationActivity.this, ProfileActivity.class);

            intent.putExtra("firstname", s);
            intent.putExtra("email", s2);
            intent.putExtra("mobile no", s5);
            startActivity(intent);

        }
    }
}

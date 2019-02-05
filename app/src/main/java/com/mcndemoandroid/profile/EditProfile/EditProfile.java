package com.mcndemoandroid.profile.EditProfile;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mcndemoandroid.R;
import com.mcndemoandroid.profile.ProfileActivity;
import com.mcndemoandroid.registration.RegistrationActivity;

public class EditProfile extends AppCompatActivity {
    EditText username, Email, Mobile;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        username = findViewById(R.id.edit);
        Email = findViewById(R.id.edit2);
        Mobile = findViewById(R.id.edit3);
        btn = findViewById(R.id.btn);


        String name, email, number;
        name = getIntent().getStringExtra("username");
        email = getIntent().getStringExtra("email");
        number = getIntent().getStringExtra("mobile_no");
        username.setText(name);
        Email.setText(email);
        Mobile.setText(number);
    }

    public void callSave(View view) {

//        a = username.getText().toString();
//        s1 = Email.getText().toString();
//        s2 = Mobile.getText().toString();
//        if (a.length() == 0) {
//            username.requestFocus();
//            username.setError("Field cannot be empty");
//        } else if (s1.length() == 0) {
//            Email.requestFocus();
//            Email.setError("field cannot be empty");
//        } else if (s2.length() == 0) {
//            Mobile.requestFocus();
//            Mobile.setError("Field cannot be empty");
//        } else {
//            Toast.makeText(EditProfile.this, "Saved successfully", Toast.LENGTH_LONG).show();
//
////            // Creating Intent Object
//            Intent intent = new Intent(EditProfile.this, UserProfileActivity.class);
////
//            intent.putExtra("username", a);
//           intent.putExtra("email", s1);
//           intent.putExtra("mobile_no", s2);
//           startActivity(intent);

        String name, email, number;
        name = username.getText().toString();
        email = Email.getText().toString();
        number = Mobile.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("username", name);
        intent.putExtra("email", email);
        intent.putExtra("mobile_no", number);
        setResult(2,intent);

        finish();
        }
//        Intent returnIntent = new Intent();
//        String result;
//        returnIntent.putExtra("result", (Parcelable) username);
//        returnIntent.putExtra("res",s1);
//        returnIntent.putExtra("re",s2);
//        setResult(ProfileActivity.RESULT_OK,returnIntent);
//        finish();
//    }


//    public void callProfile(View view) {
//        Intent intent=new Intent(EditProfile.this, ProfileActivity.class);
//        startActivity(intent);


    }


package com.mcndemoandroid.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mcndemoandroid.forgot_password.ForgetpasswordActivity;
import com.mcndemoandroid.R;
import com.mcndemoandroid.registration.RegistrationActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edt1, edt2;
    TextView text1, text2, login;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (TextView) findViewById(R.id.login);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        button = (Button) findViewById(R.id.button);

        String s1=edt1.getText().toString();
        String s2=edt2.getText().toString();
        if(s1.length()==0) {
            edt1.requestFocus();
            edt1.setError("filed cannot be empty");
        }
            else if (s1.length() == 0)

        {
            edt1.requestFocus();
            edt1.setError("Field cannot be empty");
        }

        else if(s2.length()==0)
        {
            edt2.requestFocus();
            edt2.setError("FIELD CANNOT BE EMPTY");
        }
        else
        {
            Toast.makeText(LoginActivity.this,"Validation Successful", Toast.LENGTH_LONG).show();
        }
        Intent intent=new Intent(LoginActivity.this, RegistrationActivity.class);


        }

       public void ForgetPassword()
       {
           Intent intent = new Intent(LoginActivity.this, ForgetpasswordActivity.class);
           startActivity(intent) ;
       }
    }







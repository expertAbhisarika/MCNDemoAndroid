package com.mcndemoandroid.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mcndemoandroid.Dashboard.DashBoardActivity;
import com.mcndemoandroid.forgot_password.ForgetpasswordActivity;
import com.mcndemoandroid.R;
import com.mcndemoandroid.registration.RegistrationActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edit1, edit2;
    TextView text1, text2, login;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (TextView) findViewById(R.id.login);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        edit1 = (EditText) findViewById(R.id.edt1);
        edit2 = (EditText) findViewById(R.id.edt2);
        button = (Button) findViewById(R.id.button);

    }

    public void callRegister(View view) {
       String email=edit1.getText().toString();
       String password =edit2.getText().toString();
        if (email.length() == 0) {
            edit1.requestFocus();
            edit1.setError("This field cannot be empty");
        } else if (password.length() == 0) {
            edit2.requestFocus();
            edit2.setError("This field cannot be empty");
        }
        else {
            Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(LoginActivity.this, DashBoardActivity.class);
            startActivity(intent);
        }

    }

    public void callRegisteration(View view) {
        Intent intent=new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(intent);
    }

    public void callForget(View view) {
        Intent intent=new Intent(LoginActivity.this,ForgetpasswordActivity.class);
        startActivity(intent);
    }
}







package com.mcndemoandroid.ChangePassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.mcndemoandroid.R;

public class ChangePasswordActivity extends AppCompatActivity {
    EditText oldpass,newpass,confirm;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        oldpass=(EditText)findViewById(R.id.edit1);
        newpass=(EditText)findViewById(R.id.edit2);
        confirm=(EditText)findViewById(R.id.edit3);
        button=findViewById(R.id.button);

    }
}

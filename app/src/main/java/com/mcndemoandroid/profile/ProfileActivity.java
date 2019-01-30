package com.mcndemoandroid.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mcndemoandroid.R;

public class ProfileActivity extends AppCompatActivity {

    EditText edit,edit2,edit3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        edit = (EditText) findViewById(R.id.edit);
        edit2 = (EditText) findViewById(R.id.edit2);
        edit3 = (EditText) findViewById(R.id.edit3);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                String s1 = edit2.getText().toString();
                String s2 = edit3.getText().toString();
                // Creating Intent Object
                Intent intent=new Intent();
                String name=getIntent().getStringExtra("Username");
                String email=getIntent().getStringExtra("EmailAddress");
                String mobile=getIntent().getStringExtra("MobileNumber");
                edit.setText(name);
                edit2.setText(email);
                edit3.setText(mobile);

                if(s.length()==0)

                {
                    edit.requestFocus();
                    edit.setError("FIELD CANNOT BE EMPTY");
                }

                else if(s1.length()==0)
                {
                    edit2.requestFocus();
                    edit2.setError("Field cannot be empty");
                }

                else if(s2.length()==0)
                {
                    edit3.requestFocus();
                    edit3.setError("FIELD CANNOT BE EMPTY");
                }
                Toast.makeText(ProfileActivity.this, "Updation Successful", Toast.LENGTH_LONG).show();
            }
        });
    }
}

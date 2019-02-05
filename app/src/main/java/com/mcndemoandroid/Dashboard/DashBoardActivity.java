package com.mcndemoandroid.Dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcndemoandroid.ChangePassword.ChangePasswordActivity;
import com.mcndemoandroid.R;
import com.mcndemoandroid.Settings.SettingsActivity;
import com.mcndemoandroid.profile.ProfileActivity;

public class DashBoardActivity extends AppCompatActivity {
    TextView userprofile,password,setting;
    ImageView image,image1,image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getActionBar();
        setContentView(R.layout.activity_dash_board);
        userprofile=findViewById(R.id.text1);
        password=findViewById(R.id.text2);
        setting=findViewById(R.id.text3);
        image=findViewById(R.id.img);
        image1=findViewById(R.id.img1);
        image2=findViewById(R.id.img2);
        userprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActivity.this, ProfileActivity.class);
                startActivity(intent);

            }
        });
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }



}

package com.mcndemoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivityOld extends AppCompatActivity {
EditText edt,edt1,edt2,edt3,edt4,edt5;
RadioButton rd1,rd2;
Button btk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt=(EditText)findViewById(R.id.edt);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        edt3=(EditText)findViewById(R.id.edt3);
        edt4=(EditText)findViewById(R.id.edt4);
        edt5=(EditText)findViewById(R.id.edt5);
        rd1=(RadioButton)findViewById(R.id.rd1);
        rd2=(RadioButton)findViewById(R.id.rd2);
        btk=(Button)findViewById(R.id.btk);

    btk.setOnClickListener(new View.OnClickListener() {
                               @Override
                               public void onClick(View v) {
                                   String s=edt.getText().toString();
                                   String s1=edt1.getText().toString();
                                   String s2=edt2.getText().toString();
                                   String s3=edt3.getText().toString();
                                   String s4=edt4.getText().toString();
                                   String s5=edt5.getText().toString();
                                   if(s.length()==0)

                                   {
                                       edt.requestFocus();
                                       edt.setError("FIELD CANNOT BE EMPTY");
                                   }

                                   else if(s1.length()==0)
                                   {
                                      edt1.requestFocus();
                                      edt1.setError("Field cannot be empty");
                                   }

                                   else if(s2.length()==0)
                                   {
                                       edt2.requestFocus();
                                       edt2.setError("FIELD CANNOT BE EMPTY");
                                   }
                                   else if(s3.length()==0)
                                   {
                                       edt3.requestFocus();
                                       edt3.setError("FIELD CANNOT BE EMPTY");
                                   }
                                   else if(s4.length()==0)
                                   {
                                       edt4.requestFocus();
                                       edt4.setError("FIELD CANNOT BE EMPTY");
                                   }
                                   else if(s5.length()==0)
                                   {
                                       edt5.requestFocus();
                                       edt5.setError("FIELD CANNOT BE EMPTY");
                                   }
                                   else if(rd1.isChecked())
                                   {
                                   }
                                   else
                                   {
                                       Toast.makeText(MainActivityOld.this,"Validation Successful", Toast.LENGTH_LONG).show();
                                   }
                               }
                           }
    );}
}

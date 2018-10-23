package com.example.taruc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class main extends AppCompatActivity {
    public static final String TAG_MESSAGE ="my.edu.tarc.bmicalculator.MESSAGE" ;
    private EditText editTextMessage1;
    private EditText editTextMessage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage1=findViewById(R.id.userWeight);
        editTextMessage2=findViewById(R.id.userHeight);

    }

    public void calculateBMI(View view)
    {
        double bmi;
        if(TextUtils.isEmpty(editTextMessage1.getText())||TextUtils.isEmpty(editTextMessage2.getText()))
        {
            editTextMessage1.setText("Please enter message");
            editTextMessage2.setText("Please enter message");
            return;
        }
        bmi=Double.parseDouble(editTextMessage1.getText().toString())/((Double.parseDouble(editTextMessage2.getText().toString())*Double.parseDouble(editTextMessage2.getText().toString()))/10000);
        Intent intent=new Intent(this, second_activity.class);
        intent.putExtra(TAG_MESSAGE,bmi);
        startActivity(intent);
    }


}

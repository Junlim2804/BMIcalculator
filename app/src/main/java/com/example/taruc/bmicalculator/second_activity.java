package com.example.taruc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        ImageView image;
        TextView result;
        result=findViewById(R.id.result);
        image=(ImageView)findViewById(R.id.imageView);
        Intent intent=getIntent();
        if(intent.hasExtra(main.TAG_MESSAGE))
        {
            Double stringMsg=intent.getDoubleExtra(main.TAG_MESSAGE, 0);
            if(stringMsg<18.5)
            {
                image.setImageResource(R.drawable.under);
                result.setText("Your bmi is under weight");
            }
            else if(stringMsg>25)
            {
                image.setImageResource(R.drawable.over);
                result.setText("Your bmi is over weight");
            }
            else
            {
                image.setImageResource(R.drawable.normal);
                result.setText("Your bmi is normal");
            }

        }
    }
}

package com.example.vijaya.c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
TextView textView,textView2,textView5,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        Typeface custum_font=Typeface.createFromAsset(getAssets(),"fonts/robotoMedium.ttf");
        textView.setTypeface(custum_font);
        textView2.setTypeface(custum_font);
        textView3.setTypeface(custum_font);
        textView4.setTypeface(custum_font);
        textView5.setTypeface(custum_font);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent (MainActivity.this,Login_Page.class);
                startActivity(i);
                finish();
            }
        },2000);

}}
package com.example.vijaya.c;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_up extends AppCompatActivity {
   EditText editText,editText2,editText3,editText4,editText5,editText6,editText7;
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        editText=(EditText) findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
        editText5=(EditText)findViewById(R.id.editText5);
        editText6=(EditText)findViewById(R.id.editText6);
        editText7=(EditText)findViewById(R.id.editText7);
        textView6=(TextView) findViewById(R.id.textView6);
        Typeface custum_font=Typeface.createFromAsset(getAssets(),"fonts/robotoRegular.ttf");
        editText.setTypeface(custum_font);
        editText2.setTypeface(custum_font);
        editText3.setTypeface(custum_font);
        editText4.setTypeface(custum_font);
        editText5.setTypeface(custum_font);
        editText6.setTypeface(custum_font);
        editText7.setTypeface(custum_font);
        textView6.setTypeface(custum_font);
    }
}

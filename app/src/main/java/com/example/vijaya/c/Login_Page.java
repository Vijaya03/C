package com.example.vijaya.c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class Login_Page extends AppCompatActivity {
    TextView title;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
        title=(TextView)findViewById(R.id.title);
       Typeface custum_font=Typeface.createFromAsset(getAssets(),"fonts/helvetica.ttf");
        title.setTypeface(custum_font);

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Test1.class);
                startActivity(i);
            }
        });

    }


}

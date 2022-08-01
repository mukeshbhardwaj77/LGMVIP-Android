package com.example.covid19trackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        TextView tv = (TextView) findViewById(R.id.textView3);
        TranslateAnimation animate = new TranslateAnimation(1000,tv.getWidth()+1000, 0, 0);
        animate.setDuration(1000);
        tv.startAnimation(animate);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Introduction.this, MainActivity.class));
            }
        });

    }
}
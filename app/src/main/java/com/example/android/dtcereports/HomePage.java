package com.example.android.dtcereports;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomePage extends AppCompatActivity {
    LinearLayout l1,l2;
    Button button;
    Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        //Onclick Listener To disPlay The next Activity
        Button mainView = findViewById(R.id.button);
        mainView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.content.Intent nextScreen = new android.content.Intent(HomePage.this, MainActivity.class);
                startActivity(nextScreen);
            }
        });//End of onClick Listener

        //Animation Effect
        button = (Button)findViewById(R.id.button);
        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);//End of Animation Effect
    }


}
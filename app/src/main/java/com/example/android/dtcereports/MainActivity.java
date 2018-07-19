package com.example.android.dtcereports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bibleStudy, general, holyLand, medical, programmes, registration, sepu, store, ushering, welfare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


//
        bibleStudy = findViewById(R.id.bibleStudy);
        general = findViewById(R.id.general);
        holyLand = findViewById(R.id.holyLand);
        medical = findViewById(R.id.medical);
        programmes = findViewById(R.id.programme);
        registration = findViewById(R.id.registration);
        sepu = findViewById(R.id.sepu);
        store = findViewById(R.id.store);
        ushering = findViewById(R.id.ushering);
        welfare = findViewById(R.id.welfare);

//Adding OnclickListeners To CardViews.
        bibleStudy.setOnClickListener(this);
        general.setOnClickListener(this);
        holyLand.setOnClickListener(this);
        medical.setOnClickListener(this);
        programmes.setOnClickListener(this);
        registration.setOnClickListener(this);
        sepu.setOnClickListener(this);
        store.setOnClickListener(this);
        ushering.setOnClickListener(this);
        welfare.setOnClickListener(this);

        Toolbar toolBar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolBar);
    }

    @Override
    public void onClick(View v) {

        Intent newActivities;

        switch (v.getId()){
            case R.id.bibleStudy:
                newActivities = new Intent(this, BibleStudy.class);
                startActivity(newActivities);
                break;

            case R.id.general:
                newActivities = new Intent(this, General.class);
                startActivity(newActivities);
                break;

            case R.id.holyLand:
                newActivities = new Intent(this, HolyLand.class);
                startActivity(newActivities);
                break;

            case R.id.medical:
                newActivities = new Intent(this, Medical.class);
                startActivity(newActivities);
                break;

            case R.id.programme:
                newActivities = new Intent(this, Programmes.class);
                startActivity(newActivities);
                break;

            case R.id.registration:
                newActivities = new Intent(this, Registration.class);
                startActivity(newActivities);
                break;

            case R.id.sepu:
                newActivities = new Intent(this, Sepu.class);
                startActivity(newActivities);
                break;

            case R.id.store:
                newActivities = new Intent(this, Store.class);
                startActivity(newActivities);
                break;

            case R.id.ushering:
                newActivities = new Intent(this, Ushering.class);
                startActivity(newActivities);
                break;

            case R.id.welfare:
                newActivities = new Intent(this, Welfare.class);
                startActivity(newActivities);
                break;

                default: break;
        }

    }
}
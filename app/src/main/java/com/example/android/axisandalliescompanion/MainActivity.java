package com.example.android.axisandalliescompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//TODO: HAVE A SETTINGS MENU THAT YOU PICK WHICH NATION(S) YOU'RE CONTROLLING AND THEN TAYLOR EVERYTHIGN TO THAT EX. select from a list of country's that you control to the various economys and production
//TODO: 1. make a buy page to buy various units
//TODO: include a rules reference


public class MainActivity extends AppCompatActivity {

    TextView buyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buyTextView = (TextView) findViewById(R.id.BuyTextView);
        buyTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                buyButtionFunction();
            }
        });

    }

    public void buyButtionFunction() {

        BuyActivity activty = new BuyActivity();
        Intent i = new Intent(MainActivity.this, activty.getClass());

        startActivity(i);
    }
}


package com.example.android.axisandalliescompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BuyActivity extends AppCompatActivity {

    public final Integer INFINTRY_IPC_VALUE=3;
    public final Integer TANK_IPC_VALUE=6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        final ArrayList<BuyList> buylists = new ArrayList<>();
        buylists.add(new BuyList(R.drawable.usinfantry,INFINTRY_IPC_VALUE));
        buylists.add(new BuyList(R.drawable.usatank,TANK_IPC_VALUE));


        BuyLIstAdapter adapter = new BuyLIstAdapter(this,buylists,0);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}

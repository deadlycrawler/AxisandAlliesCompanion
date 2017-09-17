package com.example.android.axisandalliescompanion;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BuyLIstAdapter extends ArrayAdapter<BuyList> {

    protected Integer GtotalQuantityAsInt;


    public BuyLIstAdapter(Activity context, ArrayList<BuyList> BuyList, int unused) {
        super(context, 0, BuyList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.buy_list, parent, false);
        }

        final BuyList currentItem = getItem(position);


        Button addOne = (Button) listItemView.findViewById(R.id.addOneButton);
        Button addFive= (Button) listItemView.findViewById(R.id.addFiveButton);
        Button subOne = (Button) listItemView.findViewById(R.id.subtractOneButton);
        Button clearItem = (Button) listItemView.findViewById(R.id.singleItemClearButton);

        TextView totalQuantity = (TextView) listItemView.findViewById(R.id.currentPurchedCount);


        addOne.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
           }
       });
        addFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        subOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        clearItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });







        //sets the image
        ImageView pieceView = (ImageView) listItemView.findViewById(R.id.pieceImage);
        pieceView.setImageResource(currentItem.getImage());
        return listItemView;
    }
}

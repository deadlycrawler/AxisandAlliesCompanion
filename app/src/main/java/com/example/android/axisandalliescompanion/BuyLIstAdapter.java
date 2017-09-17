package com.example.android.axisandalliescompanion;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class BuyLIstAdapter extends ArrayAdapter<BuyList> {


    public BuyLIstAdapter(Activity context, ArrayList<BuyList> BuyList, int unused) {
        super(context, 0, BuyList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.buy_list, parent, false);
        }

        BuyList currentItem = getItem(position);

        ImageView pieceView = (ImageView) listItemView.findViewById(R.id.pieceImage);
        pieceView.setImageResource(currentItem.getImage());
        return listItemView;
    }


}

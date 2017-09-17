package com.example.android.axisandalliescompanion;



public class BuyList {

    private int image;
   private int pieceValue;


    public BuyList(int image, int pieceValue){
        this.image=image;
        this.pieceValue=pieceValue;

    }


    //getters

    public int getImage() {
        return image;
    }

    public int getPieceValue() {
        return pieceValue;
    }
}

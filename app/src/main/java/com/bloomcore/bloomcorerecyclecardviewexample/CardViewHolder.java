package com.bloomcore.bloomcorerecyclecardviewexample;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;


/**
 * Created by Ivanco on 06.09.2015.
 */
public class CardViewHolder extends RecyclerView.ViewHolder {
    protected ImageView imageView;
    protected CardView card;
    public CardViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image);
        card = (CardView) itemView;
    }
}

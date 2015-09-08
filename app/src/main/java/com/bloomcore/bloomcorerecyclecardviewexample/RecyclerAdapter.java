package com.bloomcore.bloomcorerecyclecardviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivanco on 06.09.2015.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<Cards> cardsList;

    public RecyclerAdapter(List<Cards> cardsList){
        this.cardsList = new ArrayList<>();
        this.cardsList.addAll(cardsList);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.card_view, parent, false);
        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Cards cards = cardsList.get(position);
        holder.imageView.setImageDrawable(cards.getImage());
    }

    @Override
    public int getItemCount() {
        return cardsList.size();
    }
}

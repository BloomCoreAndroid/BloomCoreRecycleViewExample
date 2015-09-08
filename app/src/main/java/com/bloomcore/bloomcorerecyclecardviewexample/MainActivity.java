package com.bloomcore.bloomcorerecyclecardviewexample;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(new RecyclerAdapter(generateCards()));
    }

    private ArrayList<Cards> generateCards() {
        ArrayList<Cards> cards = new ArrayList<>();
        cards.add(new Cards(ContextCompat.getDrawable(this, R.drawable.construction)));
        cards.add(new Cards(ContextCompat.getDrawable(this, R.drawable.van)));
        cards.add(new Cards(ContextCompat.getDrawable(this, R.drawable.il_seminatore)));
        cards.add(new Cards(ContextCompat.getDrawable(this, R.drawable.shoes)));
        cards.add(new Cards(ContextCompat.getDrawable(this, R.drawable.bridge)));
        cards.add(new Cards(ContextCompat.getDrawable(this, R.drawable.starry_night)));
        cards.add(new Cards(ContextCompat.getDrawable(this, R.drawable.sunflower)));
        return cards;
    }

}

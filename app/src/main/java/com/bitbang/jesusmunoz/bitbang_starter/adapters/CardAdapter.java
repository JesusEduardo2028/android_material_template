package com.bitbang.jesusmunoz.bitbang_starter.adapters;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bitbang.jesusmunoz.bitbang_starter.R;
import com.bitbang.jesusmunoz.bitbang_starter.databinding.CardAdapterBinding;
import com.bitbang.jesusmunoz.bitbang_starter.objects.Card;
import com.bitbang.jesusmunoz.bitbang_starter.objects.CardHolder;

import java.util.ArrayList;

/**
 * Created by jesuseduardomunoz on 5/30/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CardHolder> {

    private  Activity activity;
    private  ArrayList<Card> initial_cards;

    public CardAdapter(Activity _activity, ArrayList<Card> _initial_cards) {
        super();
        activity = _activity;
        initial_cards = _initial_cards;
    }

    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardAdapterBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.card_adapter,parent,false);
        return new CardHolder(binding);
    }

    @Override
    public void onBindViewHolder(CardHolder holder, int position) {
        holder.bindConnection(initial_cards.get(position));
    }

    @Override
    public int getItemCount() {
        return initial_cards.size();
    }

}

package com.bitbang.jesusmunoz.bitbang_starter.fragments;

import android.app.Fragment;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bitbang.jesusmunoz.bitbang_starter.R;
import com.bitbang.jesusmunoz.bitbang_starter.adapters.CardAdapter;
import com.bitbang.jesusmunoz.bitbang_starter.objects.Card;

import java.util.ArrayList;

/**
 * Created by jesuseduardomunoz on 5/25/16.
 */
public class MainFragment extends Fragment{
    private ArrayList<Card> initial_cards;
    private CardAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private void initCards() {
        initial_cards = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.initial_names);
        int[] colors = getResources().getIntArray(R.array.initial_colors);

        for (int i = 0; i < 9; i++) {
            Card card = new Card();
            card.setId((long) i);
            card.setName(names[i]);
            card.setColor(colors[i]);
            card.setImageUrl("https://pixabay.com/get/ef31b1082df01c22d9584518a33219c8b66ae3d11fb5174696f6c17a/self-portrait-640754_1920.jpg");
            initial_cards.add(card);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View context = inflater.inflate(R.layout.main_fragment, container, false);

        initCards();
        if (adapter == null) {
            adapter = new CardAdapter(this.getActivity(), initial_cards);
        }

        recyclerView = (RecyclerView) context.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(adapter);

        return context;
    }
}

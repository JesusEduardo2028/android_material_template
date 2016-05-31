package com.bitbang.jesusmunoz.bitbang_starter.objects;

import com.bitbang.jesusmunoz.bitbang_starter.NavigationDrawerAdapter;
import com.bitbang.jesusmunoz.bitbang_starter.databinding.CardAdapterBinding;


/**
 * Created by jesuseduardomunoz on 5/30/16.
 */
public class CardHolder extends NavigationDrawerAdapter.ViewHolder {
    private CardAdapterBinding binding;

    public CardHolder(CardAdapterBinding _binding) {
        super(_binding.getRoot());
        this.binding = _binding;
    }

    public void bindConnection(Card card){
        binding.setCard(card);
    }

}

package com.bitbang.jesusmunoz.bitbang_starter.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bitbang.jesusmunoz.bitbang_starter.R;

/**
 * Created by jesuseduardomunoz on 5/25/16.
 */
public class MainFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_fragment, container, false);
    }
}

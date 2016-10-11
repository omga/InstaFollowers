package com.promotion.instafollowers.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.promotion.instafollowers.R;

/**
 * Created by Andrew on 17.09.2016.
 */
public class MainActivityFragment extends Fragment {

    private static final String TAG = "MainActivityFragment";

    public MainActivityFragment() {
        Log.d(TAG,"constructor");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}

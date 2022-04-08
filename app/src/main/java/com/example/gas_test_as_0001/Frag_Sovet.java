package com.example.gas_test_as_0001;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class Frag_Sovet extends Fragment {
    TextView day_advise;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag__sovet, null);
        day_advise = view.findViewById(R.id.day_advise);

        Contain_Data contain_data = new Contain_Data();

        Random rand = new Random();
        int number_advise = rand.nextInt(contain_data.all_advise().size());

        day_advise.setText(contain_data.all_advise().get(number_advise));

        return view;
    }
}
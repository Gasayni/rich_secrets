package com.example.gas_test_as_0001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class FragTheory extends Fragment implements View.OnClickListener{

    Button btn_10_important;
    Button btn_habit_rich;
    Button btn_advice_Success;
    Button btn_advice_John;
    Button btn_11_secrets;
    Button btn_way_earn;
    Button btn_10_ways;
    Button btn_10_ideas;
    Button btn_money_primets;
    Button btn_how_become_rich;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag_theory, null);

        btn_10_important = view.findViewById(R.id.btn_10_important);
        btn_habit_rich = view.findViewById(R.id.btn_habit_rich);
        btn_advice_Success = view.findViewById(R.id.btn_advice_Success);
        btn_advice_John = view.findViewById(R.id.btn_advice_John);
        btn_11_secrets = view.findViewById(R.id.btn_11_secrets);
        btn_way_earn = view.findViewById(R.id.btn_way_earn);
        btn_10_ways = view.findViewById(R.id.btn_10_ways);
        btn_10_ideas = view.findViewById(R.id.btn_10_ideas);
        btn_money_primets = view.findViewById(R.id.btn_money_primets);
        btn_how_become_rich = view.findViewById(R.id.btn_how_become_rich);

        btn_10_important.setOnClickListener(this);
        btn_habit_rich.setOnClickListener(this);
        btn_advice_Success.setOnClickListener(this);
        btn_advice_John.setOnClickListener(this);
        btn_11_secrets.setOnClickListener(this);
        btn_way_earn.setOnClickListener(this);
        btn_10_ways.setOnClickListener(this);
        btn_10_ideas.setOnClickListener(this);
        btn_money_primets.setOnClickListener(this);
        btn_how_become_rich.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_10_important:
                intent = new Intent("10_important");
                startActivity(intent);
                break;
            case R.id.btn_habit_rich:
                intent = new Intent("habit_rich");
                startActivity(intent);
                break;
            case R.id.btn_advice_Success:
                intent = new Intent("advice_Success");
                startActivity(intent);
                break;
            case R.id.btn_advice_John:
                intent = new Intent("advice_John");
                startActivity(intent);
                break;
            case R.id.btn_11_secrets:
                intent = new Intent("11_secrets");
                startActivity(intent);
                break;
            case R.id.btn_way_earn:
                intent = new Intent("way_earn");
                startActivity(intent);
                break;
            case R.id.btn_10_ways:
                intent = new Intent("10_ways");
                startActivity(intent);
                break;
            case R.id.btn_10_ideas:
                intent = new Intent("10_ideas");
                startActivity(intent);
                break;
            case R.id.btn_money_primets:
                intent = new Intent("money_primets");
                startActivity(intent);
                break;
            case R.id.btn_how_become_rich:
                intent = new Intent("how_become_rich");
                startActivity(intent);
                break;
        }
    }
}
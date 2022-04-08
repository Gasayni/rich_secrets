package com.example.gas_test_as_0001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Frag_practic extends Fragment implements View.OnClickListener {
    Button btn_laws_success;
    Button btn_can_i_make;
    Button btn_how_create_ideas;
    Button btn_where_to_begin;
    Button btn_way_finances_manage;
    Button btn_rich_principle;
    Button btn_7_skills;
    Button btn_questions_introspection;
    Button btn_6_steps;
    Button btn_9_important_principles;
    Button btn_7_main_rules;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag_practic, null);

        btn_laws_success = view.findViewById(R.id.btn_laws_success);
        btn_can_i_make = view.findViewById(R.id.btn_can_i_make);
        btn_how_create_ideas = view.findViewById(R.id.btn_how_create_ideas);
        btn_where_to_begin = view.findViewById(R.id.btn_where_to_begin);
        btn_way_finances_manage = view.findViewById(R.id.btn_way_finances_manage);
        btn_rich_principle = view.findViewById(R.id.btn_rich_principle);
        btn_7_skills = view.findViewById(R.id.btn_7_skills);
        btn_questions_introspection = view.findViewById(R.id.btn_questions_introspection);
        btn_6_steps = view.findViewById(R.id.btn_6_steps);
        btn_9_important_principles = view.findViewById(R.id.btn_9_important_principles);
        btn_7_main_rules = view.findViewById(R.id.btn_7_main_rules);

        btn_laws_success.setOnClickListener(this);
        btn_can_i_make.setOnClickListener(this);
        btn_how_create_ideas.setOnClickListener(this);
        btn_where_to_begin.setOnClickListener(this);
        btn_way_finances_manage.setOnClickListener(this);
        btn_rich_principle.setOnClickListener(this);
        btn_7_skills.setOnClickListener(this);
        btn_questions_introspection.setOnClickListener(this);
        btn_6_steps.setOnClickListener(this);
        btn_9_important_principles.setOnClickListener(this);
        btn_7_main_rules.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId()) {
            case R.id.btn_laws_success:
                intent = new Intent("laws_success");
                startActivity(intent);
                break;
            case R.id.btn_can_i_make:
                intent = new Intent("can_i_make");
                startActivity(intent);
                break;
            case R.id.btn_how_create_ideas:
                intent = new Intent("how_create_ideas");
                startActivity(intent);
                break;
            case R.id.btn_where_to_begin:
                intent = new Intent("where_to_begin");
                startActivity(intent);
                break;
            case R.id.btn_way_finances_manage:
                intent = new Intent("way_finances_manage");
                startActivity(intent);
                break;
            case R.id.btn_rich_principle:
                intent = new Intent("rich_principle");
                startActivity(intent);
                break;
            case R.id.btn_7_skills:
                intent = new Intent("7_skills");
                startActivity(intent);
                break;
            case R.id.btn_questions_introspection:
                intent = new Intent("questions_introspection");
                startActivity(intent);
                break;
            case R.id.btn_6_steps:
                intent = new Intent("6_steps");
                startActivity(intent);
                break;
            case R.id.btn_9_important_principles:
                intent = new Intent("9_important_principles");
                startActivity(intent);
                break;
            case R.id.btn_7_main_rules:
                intent = new Intent("7_main_rules");
                startActivity(intent);
                break;
        }

    }
}
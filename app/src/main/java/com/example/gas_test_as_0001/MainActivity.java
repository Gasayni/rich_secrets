package com.example.gas_test_as_0001;

import android.app.ActionBar;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.renderscript.Allocation;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Fragment frag_Theory;
//    Fragment frag_Practic;
//    Fragment frag_Day;

    Button btn_theory;
    Button btn_practic;
    Button btn_sovet;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_practic = findViewById(R.id.btn_practic);
        btn_theory = findViewById(R.id.btn_theory);
        btn_sovet = findViewById(R.id.btn_sovet);

        btn_theory.setOnClickListener(this);
        btn_practic.setOnClickListener(this);
        btn_sovet.setOnClickListener(this);

        // По умолчанию будет запущен фрагмент теории
        frag_Theory = new FragTheory();
        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
        ft1.replace(R.id.FragContain, frag_Theory); // для замены фрагмента в контейнере фрагментов
        ft1.commit(); // для запуска
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_theory:
                FragTheory theory_frag = new FragTheory();
                FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                ft1.replace(R.id.FragContain, theory_frag); // для замены фрагмента в контейнере фрагментов
                ft1.commit(); // для запуска
                break;
            case R.id.btn_practic:
                Frag_practic practic_frag = new Frag_practic();
                FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                ft2.replace(R.id.FragContain, practic_frag);
                ft2.commit();
                break;
            case R.id.btn_sovet:
                Frag_Sovet sovet_frag = new Frag_Sovet();
                FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
                ft3.replace(R.id.FragContain, sovet_frag);
                ft3.commit();
                break;
        }
    }
}
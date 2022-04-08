package com.example.gas_test_as_0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_money_primets extends AppCompatActivity {
    TextView line1;
    TextView line2;
    TextView line3;
    TextView line4;
    TextView line5;
    TextView line6;
    TextView line7;
    TextView line8;
    TextView line9;
    TextView line10;
    TextView line11;
    TextView line12;
    TextView line13;
    TextView line14;
    TextView line15;
    TextView line16;
    TextView line17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_primets);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);
        line5 = findViewById(R.id.line5);
        line6 = findViewById(R.id.line6);
        line7 = findViewById(R.id.line7);
        line8 = findViewById(R.id.line8);
        line9 = findViewById(R.id.line9);
        line10 = findViewById(R.id.line10);
        line11 = findViewById(R.id.line11);
        line12 = findViewById(R.id.line12);
        line13 = findViewById(R.id.line13);
        line14 = findViewById(R.id.line14);
        line15 = findViewById(R.id.line15);
        line16 = findViewById(R.id.line16);
        line17 = findViewById(R.id.line17);

        Contain_Data contain_data = new Contain_Data();
        line1.setText(contain_data.money_primets().get(0));
        line2.setText(contain_data.money_primets().get(1));
        line3.setText(contain_data.money_primets().get(2));
        line4.setText(contain_data.money_primets().get(3));
        line5.setText(contain_data.money_primets().get(4));
        line6.setText(contain_data.money_primets().get(5));
        line7.setText(contain_data.money_primets().get(6));
        line8.setText(contain_data.money_primets().get(7));
        line9.setText(contain_data.money_primets().get(8));
        line10.setText(contain_data.money_primets().get(9));
        line11.setText(contain_data.money_primets().get(10));
        line12.setText(contain_data.money_primets().get(11));
        line13.setText(contain_data.money_primets().get(12));
        line14.setText(contain_data.money_primets().get(13));
        line15.setText(contain_data.money_primets().get(14));
        line16.setText(contain_data.money_primets().get(15));
        line17.setText(contain_data.money_primets().get(16));
    }
}
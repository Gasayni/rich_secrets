package com.example.gas_test_as_0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_way_earn extends AppCompatActivity {
    TextView line1;
    TextView line2;
    TextView line3;
    TextView line4;
    TextView line5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_way_earn);
        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);
        line5 = findViewById(R.id.line5);

        Contain_Data contain_data = new Contain_Data();
        line1.setText(contain_data.way_earn().get(0));
        line2.setText(contain_data.way_earn().get(1));
        line3.setText(contain_data.way_earn().get(2));
        line4.setText(contain_data.way_earn().get(3));
        line5.setText(contain_data.way_earn().get(4));
    }
}
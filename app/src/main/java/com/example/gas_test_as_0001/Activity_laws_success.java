package com.example.gas_test_as_0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_laws_success extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_success);

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

        Contain_Data contain_data = new Contain_Data();
        line1.setText(contain_data.laws_success().get(0));
        line2.setText(contain_data.laws_success().get(1));
        line3.setText(contain_data.laws_success().get(2));
        line4.setText(contain_data.laws_success().get(3));
        line5.setText(contain_data.laws_success().get(4));
        line6.setText(contain_data.laws_success().get(5));
        line7.setText(contain_data.laws_success().get(6));
        line8.setText(contain_data.laws_success().get(7));
        line9.setText(contain_data.laws_success().get(8));
        line10.setText(contain_data.laws_success().get(9));
    }
}
package com.example.gas_test_as_0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_7_skills extends AppCompatActivity {
    TextView line1;
    TextView line2;
    TextView line3;
    TextView line4;
    TextView line5;
    TextView line6;
    TextView line7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity7_skills);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);
        line5 = findViewById(R.id.line5);
        line6 = findViewById(R.id.line6);
        line7 = findViewById(R.id.line7);

        Contain_Data contain_data = new Contain_Data();
        line1.setText("1.\t" + contain_data._7_skills().get(0));
        line2.setText("2.\t" + contain_data._7_skills().get(1));
        line3.setText("3.\t" + contain_data._7_skills().get(2));
        line4.setText("4.\t" + contain_data._7_skills().get(3));
        line5.setText("5.\t" + contain_data._7_skills().get(4));
        line6.setText("6.\t" + contain_data._7_skills().get(5));
        line7.setText("7.\t" + contain_data._7_skills().get(6));

    }
}
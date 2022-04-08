package com.example.gas_test_as_0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_how_become_rich extends AppCompatActivity {
    TextView line1;
    TextView line2;
    TextView line3;
    TextView line4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_become_rich);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);

        Contain_Data contain_data = new Contain_Data();
        line1.setText(contain_data.how_become_rich().get(0));
        line2.setText(contain_data.how_become_rich().get(1));
        line3.setText(contain_data.how_become_rich().get(2));
        line4.setText(contain_data.how_become_rich().get(3));
    }
}
package com.example.gas_test_as_0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_10_important extends AppCompatActivity {
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
        setContentView(R.layout.activity_activity10_important);

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
        line1.setText(contain_data._10_important().get(0));
        line2.setText("Второе – " + contain_data._10_important().get(1));
        line3.setText("Третье – " + contain_data._10_important().get(2));
        line4.setText("Четвертое – " + contain_data._10_important().get(3));
        line5.setText("Пятое – " + contain_data._10_important().get(4));
        line6.setText("Шестое – " + contain_data._10_important().get(5));
        line7.setText("Седьмое – " + contain_data._10_important().get(6));
        line8.setText("Восьмое – " + contain_data._10_important().get(7));
        line9.setText("Девятое – " + contain_data._10_important().get(8));
        line10.setText("Десятое – " + contain_data._10_important().get(9));
    }
}
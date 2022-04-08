package com.example.gas_test_as_0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_rich_principle extends AppCompatActivity {
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
    TextView line18;
    TextView line19;
    TextView line20;
    TextView line21;
    TextView line22;
    TextView line23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rich_principle);

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
        line18 = findViewById(R.id.line18);
        line19 = findViewById(R.id.line19);
        line20 = findViewById(R.id.line20);
        line21 = findViewById(R.id.line21);
        line22 = findViewById(R.id.line22);
        line23 = findViewById(R.id.line23);

        Contain_Data contain_data = new Contain_Data();
        line1.setText("Принцип №1 — " + contain_data.rich_principle().get(0));
        line2.setText("Принцип №2 — " + contain_data.rich_principle().get(1));
        line3.setText("Принцип №3 — " + contain_data.rich_principle().get(2));
        line4.setText("Принцип №4 — " + contain_data.rich_principle().get(3));
        line5.setText("Принцип №5 — " + contain_data.rich_principle().get(4));
        line6.setText("Принцип №6 — " + contain_data.rich_principle().get(5));
        line7.setText("Принцип №7 " + contain_data.rich_principle().get(6));
        line8.setText("Принцип №8 — " + contain_data.rich_principle().get(7));
        line9.setText("Принцип №9 " + contain_data.rich_principle().get(8));
        line10.setText("Принцип №10 — " + contain_data.rich_principle().get(9));
        line11.setText("Принцип №11 — " + contain_data.rich_principle().get(10));
        line12.setText("Принцип №12 — " + contain_data.rich_principle().get(11));
        line13.setText("Принцип №13 — " + contain_data.rich_principle().get(12));
        line14.setText("Принцип №14 — " + contain_data.rich_principle().get(13));
        line15.setText("Принцип №15 — " + contain_data.rich_principle().get(14));
        line16.setText("Принцип №16 — " + contain_data.rich_principle().get(15));
        line17.setText("Дополнение к принципу 16 – " + contain_data.rich_principle().get(16));
        line18.setText("Принцип №17 — " + contain_data.rich_principle().get(17));
        line19.setText("Принцип №18 — " + contain_data.rich_principle().get(18));
        line20.setText("Принцип №19 — " + contain_data.rich_principle().get(19));
        line21.setText("Принцип №20 — " + contain_data.rich_principle().get(20));
        line22.setText("Принцип №21 — " + contain_data.rich_principle().get(21));
        line23.setText("Принцип №22 — " + contain_data.rich_principle().get(22));
    }
}
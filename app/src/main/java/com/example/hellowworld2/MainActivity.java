package com.example.hellowworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int skorA= 0;
    private int skorB= 0;
    private int reset= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3PoinA(View view) {
        skorA = skorA + 3;
        TextView textViewA = findViewById(R.id.skorA);
        textViewA.setText(String.valueOf(skorA));
    }

    public void tambah2PointA(View view) {
        skorA = skorA + 2;
        TextView textViewA = findViewById(R.id.skorA);
        textViewA.setText(String.valueOf(skorA));
    }

    public void tambah1PointA(View view) {
        skorA = skorA + 1;
        TextView textViewA = findViewById(R.id.skorA);
        textViewA.setText(String.valueOf(skorA));
    }

    public void tambah3PoinB(View view) {
        skorB = skorB + 3;
        TextView textViewB = findViewById(R.id.skorB);
        textViewB.setText(String.valueOf(skorB));
    }

    public void tambah2PointB(View view) {
        skorB = skorB + 2;
        TextView textViewB = findViewById(R.id.skorB);
        textViewB.setText(String.valueOf(skorB));
    }

    public void tambah1PointB(View view) {
        skorB = skorB + 1;
        TextView textViewB = findViewById(R.id.skorB);
        textViewB.setText(String.valueOf(skorB));
    }

    public void reset(View view){
        reset=skorA=0;
        reset=skorB=0;
        TextView textViewA=findViewById(R.id.skorA);
        TextView textViewB=findViewById(R.id.skorB);
        textViewA.setText(String.valueOf(reset));
        textViewB.setText(String.valueOf(reset));
    }

}


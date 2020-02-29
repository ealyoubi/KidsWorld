package com.example.esraa.kidsworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LearnOrPalyNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_or_paly_number);
    }
    public void learn(View view) {
        Intent intent = new Intent(this, LearnNumberZero.class);
        startActivity(intent);
    }
    public void play(View view) {
        Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);
    }
    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}

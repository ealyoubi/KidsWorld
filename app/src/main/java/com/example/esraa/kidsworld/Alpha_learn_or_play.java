package com.example.esraa.kidsworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Alpha_learn_or_play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_learn_or_play);
    }
    public void learn(View view) {
        Intent intent = new Intent(this, LearnAlphOne.class);
        startActivity(intent);
    }
    public void play(View view) {
        Intent intent = new Intent(this, Alpha.class);
        startActivity(intent);
    }
    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}

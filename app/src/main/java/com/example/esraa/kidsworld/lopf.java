package com.example.esraa.kidsworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class lopf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lopf);
    }
    public void learn(View view) {
        Intent intent = new Intent(this, LearnfruitOne.class);
        startActivity(intent);
    }
    public void play(View view) {
        Intent intent = new Intent(this,playfruitone.class);
        startActivity(intent);
    }
    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}


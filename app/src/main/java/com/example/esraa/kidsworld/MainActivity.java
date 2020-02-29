package com.example.esraa.kidsworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToActivity2(textview);
        textview = (TextView) findViewById(R.id.KidsGuru);
        button = (Button) findViewById(R.id.Start);
    }

    public void goToActivity2(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}


package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearnNumberZero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_number_zero);
        final MediaPlayer ZeroSound =MediaPlayer.create(this,R.raw.zero);
        Button button=(Button)findViewById(R.id.zero);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          ZeroSound.start();
                                      }
                                  }
        );}
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,LearnNumberOne.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this, LearnOrPalyNumber.class);
        startActivity(intent);
    }
}

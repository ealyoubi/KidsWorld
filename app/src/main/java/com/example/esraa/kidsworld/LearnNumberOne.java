package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearnNumberOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_number_one);
        final MediaPlayer OneSound =MediaPlayer.create(this,R.raw.one);
        Button button=(Button)findViewById(R.id.one);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          OneSound.start();
                                      }
                                  }
        );}
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,LearnNumberTwo.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this, LearnNumberZero.class);
        startActivity(intent);
    }
}

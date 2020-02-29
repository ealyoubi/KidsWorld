package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearncolorThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learncolor_three);

        final MediaPlayer DSound =MediaPlayer.create(this,R.raw.black);
        Button button=(Button)findViewById(R.id.al);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          DSound.start();
                                      }
                                  }
        );}
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,LearncolorOne.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this,LearncolorTwo.class);
        startActivity(intent);
    }
}

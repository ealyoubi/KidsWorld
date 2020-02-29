package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearnAnimalTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_animal_two);
        final MediaPlayer MonkeySound =MediaPlayer.create(this,R.raw.monkey);
        Button button=(Button)findViewById(R.id.monkey);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          MonkeySound.start();
                                      }
                                  }
        );}
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,LearnAnimalThree.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this,LearnAnimalOne.class);
        startActivity(intent);
    }
}

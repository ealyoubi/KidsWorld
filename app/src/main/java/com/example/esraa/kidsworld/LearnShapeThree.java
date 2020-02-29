package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearnShapeThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_shape_three);
        final MediaPlayer CircleSound =MediaPlayer.create(this,R.raw.circle);
        Button button=(Button)findViewById(R.id.circle);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          CircleSound.start();
                                      }
                                  }
        );}
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,LearnShapeOne.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this,LearnShapeTwo.class);
        startActivity(intent);
    }
}

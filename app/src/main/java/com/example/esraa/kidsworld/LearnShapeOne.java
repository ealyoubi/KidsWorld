package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearnShapeOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_shape_one);

        final MediaPlayer TriangleSound =MediaPlayer.create(this,R.raw.triangle);
        Button button=(Button)findViewById(R.id.triangle);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          TriangleSound.start();
                                      }
                                  }
        );}
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,LearnShapeTwo.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}

package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Alphabet_Third_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet__third_);
        final MediaPlayer CSound =MediaPlayer.create(this,R.raw.c);
        Button button=(Button)findViewById(R.id.press);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          CSound.start();
                                      }
                                  }
        );}

    public void goBack(View view){
        Intent intent = new Intent(this,Alphabet_Second_Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,Alpha.class);
        startActivity(intent);
    }
}

package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Ahpha_second_play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahpha_second_play);
        ProgressBar prg;
        Button button;
            ImageView Bphoto = (ImageView) findViewById(R.id.bl_Image);
            final MediaPlayer BSound = MediaPlayer.create(this, R.raw.b);
            Bphoto.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View view) {
                                              BSound.start();
                                          }
                                      }
            );
        }
    public void wrong(View view) {
        Toast.makeText(getApplicationContext(), "WRONG",
                Toast.LENGTH_SHORT).show();
    }

    public void correct(View view) {
        Toast.makeText(getApplicationContext(), "CORRECT",
                Toast.LENGTH_SHORT).show();
    }

    public void back(View view) {
        Intent intent = new Intent(this, Alpha.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this,activity_ahpha_third_play.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}




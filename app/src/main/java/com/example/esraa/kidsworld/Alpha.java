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

public class Alpha extends AppCompatActivity {

    ProgressBar prg;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        ImageView Aphoto = (ImageView) findViewById(R.id.ah_Image);
        final MediaPlayer As = MediaPlayer.create(this, R.raw.a);
        Aphoto.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View view) {
                                             As.start();
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
        Intent intent = new Intent(this, Alpha_learn_or_play.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this,Ahpha_second_play.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}



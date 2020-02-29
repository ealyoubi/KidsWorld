package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class playColorTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_color_two);


        ImageView Aphoto = (ImageView) findViewById(R.id.yy_Image);
        final MediaPlayer As = MediaPlayer.create(this, R.raw.yellow);
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
        Intent intent = new Intent(this, Colorr.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this,playColorThree.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}



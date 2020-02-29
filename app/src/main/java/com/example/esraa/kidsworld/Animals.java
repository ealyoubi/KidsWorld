package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Animals extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        ImageView TortoisePhoto = (ImageView) findViewById(R.id.TortoiseImage);
        button = (Button) findViewById(R.id.Rabbit);
        button = (Button) findViewById(R.id.Lion);
        button = (Button) findViewById(R.id.Cat);
        button = (Button) findViewById(R.id.Tortoise);
        final MediaPlayer TortoiseSound = MediaPlayer.create(this, R.raw.tortoise);
        TortoisePhoto.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View view) {
                                                 TortoiseSound.start();
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
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Animals_Second_Activity.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}



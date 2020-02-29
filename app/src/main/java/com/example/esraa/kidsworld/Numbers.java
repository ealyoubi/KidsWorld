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

public class Numbers extends AppCompatActivity {
ProgressBar prg;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ImageView ZeroPhoto = (ImageView) findViewById(R.id.ZeroImage);
        final MediaPlayer ZeroSound = MediaPlayer.create(this, R.raw.zero);
        ZeroPhoto.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View view) {
                                                 ZeroSound.start();
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
        Intent intent = new Intent(this, LearnOrPalyNumber.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Numbers_Second_Activity.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}



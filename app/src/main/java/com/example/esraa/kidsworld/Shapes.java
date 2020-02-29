package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Shapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        ImageView TrianglePhoto = (ImageView) findViewById(R.id.triangleImage);
        final MediaPlayer TriangleSound = MediaPlayer.create(this, R.raw.triangle);
        TrianglePhoto.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View view) {
                                               TriangleSound.start();
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
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this,Shapes_Second_Activity.class);
        startActivity(intent);
    }
    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}


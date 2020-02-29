package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Numbers_Third_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers__third_);
     ImageView TwoPhoto = (ImageView) findViewById(R.id.TwoImage);
    final MediaPlayer TwoSound = MediaPlayer.create(this, R.raw.two);
        TwoPhoto.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            TwoSound.start();
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
        Intent intent = new Intent(this, Numbers_Second_Activity.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Numbers_Last_Activity.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}


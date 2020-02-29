package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Alphabet_Last_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet__last_);
        final MediaPlayer ABCSound = MediaPlayer.create(this, R.raw.letters);
        Button button = (Button) findViewById(R.id.press);
        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View view) {
                                          ABCSound.start();
                                      }
                                  }
        );
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, Alphabet_Third_Activity.class);
        startActivity(intent);
    }

    public void Menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void tryAgain(View view) {
        Intent intent = new Intent(this, Alphabet.class);
        startActivity(intent);
    }
}
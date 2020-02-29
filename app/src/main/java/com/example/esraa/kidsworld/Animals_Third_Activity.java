package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Animals_Third_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals__third_);
        ImageView PandaPhoto = (ImageView) findViewById(R.id.pandaImage);
        final MediaPlayer pandaSound = MediaPlayer.create(this, R.raw.panda);
        PandaPhoto.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View view) {
                                               pandaSound.start();
                                           }
                                       }
        );
    }
    public void wrong(View view){
        Toast.makeText(getApplicationContext(),"WRONG",
                Toast.LENGTH_SHORT).show();
    }
    public void correct(View view){
        Toast.makeText(getApplicationContext(),"CORRECT",
                Toast.LENGTH_SHORT).show();}
    public void back(View view) {
        Intent intent = new Intent(this,Animals_Second_Activity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,Animals_last_Activity.class);
        startActivity(intent);
    }
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}

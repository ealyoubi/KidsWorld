package com.example.esraa.kidsworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Colors_Third_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors__third_);
    }
    public void wrong(View view) {
        Toast.makeText(getApplicationContext(), "WRONG",
                Toast.LENGTH_SHORT).show();
    }

    public void correct(View view) {
        Toast.makeText(getApplicationContext(), "CORRECT",
                Toast.LENGTH_SHORT).show();
    }

    public void goBack(View view){
        Intent intent = new Intent(this,Colors.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this,Color_Last_Activity.class);
        startActivity(intent);
    }
}


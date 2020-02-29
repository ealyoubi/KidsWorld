package com.example.esraa.kidsworld;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class  Menu extends AppCompatActivity {
    ListView simpleList;
    String List[]= {"Numbers",  "Colors ", "Alphabets", "Shapes", "Animals","Fruits" };
    int image[]={R.drawable.numbers,  R.drawable.pink, R.drawable.letters,
            R.drawable.shapes,R.drawable.animals,R.drawable.fofo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), List, image);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position ==0 ) {
                   Intent intent = new Intent(view.getContext(), LearnOrPalyNumber.class);
                   startActivityForResult(intent, 0);
               }
                if (position ==1) {
                    Intent intent = new Intent(view.getContext(), lorpc.class);
                    startActivityForResult(intent, 0);
                }
                if (position ==2) {
                    Intent intent = new Intent(view.getContext(), Alpha_learn_or_play.class);
                    startActivityForResult(intent, 0);
                }
                if (position ==3) {
                    Intent intent = new Intent(view.getContext(), LearnOrPlayShapes.class);
                    startActivityForResult(intent, 0);
                }

                if (position ==4) {
                    Intent intent = new Intent(view.getContext(), LearnOrPlay.class);
                    startActivityForResult(intent, 0);
                }
                if (position ==5) {
                    Intent intent = new Intent(view.getContext(), lopf.class);
                    startActivityForResult(intent, 0);
                }


            }
        });
    }
}


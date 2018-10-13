package com.example.taktuk.lab1codepath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.R.color;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //POPUP "That is correct!"
//                findViewById(R.id.myView).setBackgroundColor(getResources().getColor(R.color.my_green_color, null));
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.my_green_color, null));

            }
        });
        //sorry try again
        findViewById(R.id.flashcard_answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.my_red_color, null));

            }
        });
        //sorry try again
        findViewById(R.id.flashcard_answer3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.my_red_color, null));
            }
        });
    }

}

package com.example.taktuk.lab1codepath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.R.color;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String question = getIntent().getStringExtra("question");
//        String answer = getIntent().getStringExtra("answer");
//        final TextView v = (TextView) findViewById(R.id.flashcard_question);
//        v.setText(question);
//        v.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final TextView w = (TextView) findViewById(R.id.flashcard_answer);
//                w.setText(answer);
//            }
//        });







        findViewById(R.id.flashcard_answer).setVisibility(View.GONE);
        findViewById(R.id.flashcard_answer2).setVisibility(View.GONE);
        findViewById(R.id.flashcard_answer3).setVisibility(View.GONE);
        findViewById(R.id.closeButton).setVisibility(View.GONE);
        findViewById(R.id.flashcard_answer).setVisibility(View.GONE);

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                //POPUP "That is correct!"
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer2).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer3).setVisibility(View.VISIBLE);
            }
        });


        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //POPUP "That is correct!"
                findViewById(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.my_red_color, null));

            }
        });
        //sorry try again
        findViewById(R.id.flashcard_answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.my_green_color, null));


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
    /* ** Make sure onActivityResult() is placed outside of onCreate()! Since onActivityResult() is it's own method, it needs to be placed outside of any other methods. In Java, you cannot put methods inside other methods, so in general
     it's a good habit to remember that whenever we're adding new methods, we want to place them outside of onCreate().
      */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (resultCode == RESULT_OK && requestCode == 20) {
            String question = intent.getExtras().getString("question"); // 'string1' needs to match the key we used when we put the string in the Intent
          String  answer = intent.getExtras().getString("answer");
            TextView w = (TextView) findViewById(R.id.flashcard_question);
            w.setText(question);
            TextView y = (TextView) findViewById(R.id.flashcard_answer);
            y.setText(answer);
            TextView a = (TextView) findViewById(R.id.flashcard_answer2);
            a.setText("");
            TextView b = (TextView) findViewById(R.id.flashcard_answer3);
            b.setText("");






        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, AddCardActivity.class);
        this.startActivityForResult(intent, 20);
    }
}


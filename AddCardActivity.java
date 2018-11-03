package com.example.taktuk.lab1codepath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {
    private final int REQUEST_CODE = 20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        findViewById(R.id.closeButton).setVisibility(View.VISIBLE);

        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       // save action listener
                EditText EditQuestion = (EditText) findViewById(R.id.question);
                 String strQuestion = EditQuestion.getText().toString();
                EditText EditAnswer = (EditText) findViewById(R.id.answer);
                 String strAnswer = EditAnswer.getText().toString();
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                intent.putExtra("question", strQuestion);
                intent.putExtra("answer", strAnswer);                     // send data to intent
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
    public void onClicks(View view){  // this is the CLOSE button
        this.finish();
    }



}

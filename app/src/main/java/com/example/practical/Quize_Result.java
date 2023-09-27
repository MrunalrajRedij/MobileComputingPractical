package com.example.practical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Quize_Result extends AppCompatActivity{

    TextView c, w;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize_result);
        Bundle extras = getIntent().getExtras();
        String correct = extras.getString("Correct");
        String wrong = extras.getString("Wrong");
        c = (TextView) findViewById(R.id.correct);
        w = (TextView) findViewById(R.id.wrong);
        c.setText(correct);
        w.setText(wrong);

        //back btn
        b1 = findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quize_Result.this,Homescreen.class);
                startActivity(intent);
            }
        });
    }

    public void check(View view) {

    }
}
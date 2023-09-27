package com.example.practical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Quize_questions extends AppCompatActivity {

    TextView t1;
    Button b1,b2,b3,b4;
    int flag = 0;
    int correct = 0;
    int wrong = 0;
    String questions[] = {"Who is the President of India?",
            "Name the National bird of India?",
            "Who is the Owner of Reliance?",
            "What is the Capital of India"};
    String options[][] = {{"Narendra Modi","Droupadi Murmu", "Sashi Tharoor","Ram Nath Kovind"},
            {"Parrots","Hornbill","Peacock","Woodpeckers"},
            {"Ratan Tata", "Gautam Adani","Mukesh Ambani", "Anil Ambani"},
            {"Chennai", "Delhi","Mumbai", "Ayodhya"}};
    String ans[] = {"Droupadi Murmu","Peacock","Mukesh Ambani","Delhi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize_questions);
        t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        make();
    }
    public void make()
    {
        t1.setText(questions[flag]);
        b1.setText(options[flag][0]);
        b2.setText(options[flag][1]);
        b3.setText(options[flag][2]);
        b4.setText(options[flag][3]);
    }
    public void check(View v)
    {
        Button b = (Button) findViewById(v.getId());
        if((b.getText().toString()).equals(ans[flag]))
        {
            correct++;
        }
        else
        {
            wrong++;
        }
        flag++;
        if(flag <= questions.length - 1)
        {
            make();
        }
        else
        {
            Intent intent = new Intent(Quize_questions.this, Quize_Result.class);
            Bundle bundle = new Bundle();
            bundle.putString("Correct", correct + "");
            bundle.putString("Wrong", wrong + "");
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
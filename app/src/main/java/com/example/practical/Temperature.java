package com.example.practical;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
public class Temperature extends AppCompatActivity {

    EditText input;
    RadioButton ctof, ftoc;
    Button convert;
    TextView output;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        input = (EditText) findViewById(R.id.input);
        ctof = (RadioButton) findViewById(R.id.ctof);

        ftoc = (RadioButton) findViewById(R.id.ftoc);
        output = (TextView) findViewById(R.id.output);
        radiogroup = (RadioGroup)
                findViewById(R.id.radiogroup);
        convert = (Button) findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (radiogroup.getCheckedRadioButtonId() ==
                        ctof.getId()){
                    float n =
                            Float.parseFloat(input.getText().toString());
                    float ans = (n * 9/5) + 32;
                    output.setText("F: " + ans);

                }
                else if (radiogroup.getCheckedRadioButtonId()
                        == ftoc.getId()){
                    float n =
                            Float.parseFloat(input.getText().toString());
                    float ans = ((n - 32) * 5 / 9);
                    output.setText("C: " + ans);
                }
            }
        });
    }
}
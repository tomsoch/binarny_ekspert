package com.example.binarnyekspert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {   String currentText = btn.getText().toString();
        String currentText2 = btn2.getText().toString();
        String currentText3 = btn3.getText().toString();
        String currentText4 = btn4.getText().toString();
        String currentText5 = btn5.getText().toString();
        if (v.getId() == R.id.button)
            btn.setText(currentText.equals("0") ? "1" : "0");
        if (v.getId() == R.id.button2)
            btn2.setText(currentText2.equals("0") ? "1" : "0");
        if (v.getId() == R.id.button3)
            btn3.setText(currentText3.equals("0") ? "1" : "0");
        if (v.getId() == R.id.button4)
            btn4.setText(currentText4.equals("0") ? "1" : "0");
        if (v.getId() == R.id.button5)
            btn5.setText(currentText5.equals("0") ? "1" : "0");


    }
}
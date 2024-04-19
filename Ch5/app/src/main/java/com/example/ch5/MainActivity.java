package com.example.ch5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    private float size = 20;
    private TextView output;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.lblOutput);
        output.setTextSize(size);
        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            size++;
        }
        else {
            size--;
        }
        output.setTextSize(size);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event){
        int act = event.getAction();
        switch(act) {
            case MotionEvent.ACTION_DOWN:
                txvOutput.setText("ACTION_DOWN");
                txvOutput.setTextColor(Color.RED);
                break;
            case MotionEvent.ACTION_UP:
                txvOutput.setText("ACTION_UP");
                txvOutput.setTextColor(Color.GREEN);
                break;
            case MotionEvent.ACTION_MOVE:
                float x = event.getX();
                float y = event.getY();
                txvOutput.setText("ACTION_DOWN");
                txvOutput.setTextColor(Color.RED);
                break;
        }
    }
}
package com.example.ch5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity//       implements View.OnClickListener
{
    private float size = 20;
    private TextView output = (TextView) findViewById(R.id.lblOutput);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output.setTextSize(size);
        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btnExit = (Button) findViewById(R.id.btnExit);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                size ++;
                output.setTextSize(size);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                size --;
                output.setTextSize(size);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
//    @Override
//    public void onClick(View view) {
//        if (view.getId() == R.id.button) {
//            size++;
//        }
//        else {
//            size--;
//        }
//        output.setTextSize(size);
//    }
}
package com.example.soc7.labapp2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by eric on 02/10/2017.
 */

public class Lab1 extends Activity {

    private TextView text1 = null;
    private Button btn1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab1);

        text1 = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.clickMeBtn);
        //when button clicked

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(Lab1.this, "OUCH!!! You clicked me!!",
                        Toast.LENGTH_LONG).show();

                Vibrator v = (Vibrator) Lab1.this.getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);
            }
        });
    }
}
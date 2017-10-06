package com.example.soc7.labapp2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by eric on 02/10/2017.
 */

public class Lab5a extends Activity{



    private Button greenButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_lab5a); // red bg set as default//
        greenButton = (Button)findViewById(R.id.greenButton);


        //set click listeners on each button
        greenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent i = new Intent(view.getContext(),Lab5b.class);
                //switch over to lab5b class
                startActivity(i);


                Toast.makeText(Lab5a.this, "you clicked red Button!!",
                        Toast.LENGTH_SHORT).show();


                Vibrator v = (Vibrator) Lab5a.this.getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);
            }
        });



    }//end onCreate





}//end Lab3

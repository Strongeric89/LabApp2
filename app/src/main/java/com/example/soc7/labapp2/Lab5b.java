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

public class Lab5b extends Activity{



    private Button redButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_lab5b); // red bg set as default
        redButton = (Button)findViewById(R.id.redButton);


        //set click listeners on each button
        redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



                Intent i = new Intent(view.getContext(),Lab5a.class);
                //switch over to lab5a class
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // THIS LINE STOPS AN INTENT CHAIN FROM OCCURING
                startActivity(i);

                Toast.makeText(Lab5b.this, "you clicked Green Button!!",
                        Toast.LENGTH_SHORT).show();


                Vibrator v = (Vibrator) Lab5b.this.getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);
            }
        });


    }//end onCreate





}//end Lab3

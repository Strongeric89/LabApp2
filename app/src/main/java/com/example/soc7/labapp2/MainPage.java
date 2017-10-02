package com.example.soc7.labapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by eric on 02/10/2017.
 */

public class MainPage extends Activity {

    private Button lab1 = null;
    private Button lab2 = null;
    private Button lab3 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_page);

        //create intent to lab2
        lab1 = (Button) findViewById(R.id.goToLab1);

        lab1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab1.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });


        //create intent to lab2
        lab2 = (Button) findViewById(R.id.goToLab2);

        lab2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab2.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });

    }//end onCreate

}// end MainPage
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
    private Button lab2b = null;
    private Button lab3 = null;
    private Button lab4 = null;
    private Button lab5 = null;
    private Button lab5c = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_page);

        //create intent to lab1
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

        //create intent to lab2
        lab2b = (Button) findViewById(R.id.goToLab2b);

        lab2b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab2b.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });


        //create intent to lab3
        lab3 = (Button) findViewById(R.id.goToLab3);

        lab3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab3.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });


        //create intent to lab4
        lab4 = (Button) findViewById(R.id.goToLab4);

        lab4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab4.class);
                //switch over to lab4 class
                startActivity(i);

            }
        });


        //create intent to lab5
        lab5 = (Button) findViewById(R.id.goToLab5);

        lab5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab5a.class);
                //switch over to lab5 class
                startActivity(i);

            }
        });

        //create intent to lab5
        lab5c = (Button) findViewById(R.id.goToLab5c);

        lab5c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab5c.class);
                //switch over to lab5 class
                startActivity(i);

            }
        });


    }//end onCreate

}// end MainPage

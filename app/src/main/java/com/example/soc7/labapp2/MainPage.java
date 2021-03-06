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
    private Button lab6a = null;
    private Button lab6c = null;
    private Button lab7 = null;
    private Button lab8 = null;
    private Button webscrape = null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_page);

        //create intent to lab1
        lab1 = findViewById(R.id.goToLab1);

        lab1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab1.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });


        //create intent to lab2
        lab2 = findViewById(R.id.goToLab2);

        lab2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab2.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });

        //create intent to lab2
        lab2b = findViewById(R.id.goToLab2b);

        lab2b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab2b.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });


        //create intent to lab3
        lab3 = findViewById(R.id.goToLab3);

        lab3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab3.class);
                //switch over to lab1 class
                startActivity(i);

            }
        });


        //create intent to lab4
        lab4 = findViewById(R.id.goToLab4);

        lab4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab4.class);
                //switch over to lab4 class
                startActivity(i);

            }
        });


        //create intent to lab5
        lab5 = findViewById(R.id.goToLab5);

        lab5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab5a.class);
                //switch over to lab5 class
                startActivity(i);

            }
        });

        //create intent to lab5
        lab5c = findViewById(R.id.goToLab5c);

        lab5c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab5c.class);
                //switch over to lab5 class
                startActivity(i);

            }
        });

        //create intent to lab6
        lab6a = findViewById(R.id.goToLab6a);

        lab6a.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab6a.class);
                //switch over to lab5 class
                startActivity(i);

            }
        });



        lab6c = findViewById(R.id.goToLab6c);

        lab6c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab6c.class);

                startActivity(i);

            }
        });


        lab7 = findViewById(R.id.goToLab7);

        lab7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab7.class);

                startActivity(i);

            }
        });

        lab8 = findViewById(R.id.goToLab8);

        lab8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Lab8.class);

                startActivity(i);

            }
        });

        webscrape = findViewById(R.id.goToWebScrape);

        webscrape.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(view.getContext(),webScrape.class);
                //switch over to lab5 class
                startActivity(i);

            }
        });



    }//end onCreate

}// end MainPage

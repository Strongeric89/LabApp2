package com.example.soc7.labapp2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by eric on 28/10/2017.
 */


public class Lab6a extends Activity {

    public static String array[] = {"The Dark Knight", "the avengers", "Suicide Squad", "Man of Steel", "Dark Knight Rises", "Justice League"}; // make this global to all activities
    public static final String MOVIE_KEY = "MOVIE";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_lab6a); // set layout
        ListView taskListView = (ListView) findViewById(R.id.task_list);

        //array of my favorite movies
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, array);

        taskListView.setAdapter(adapter);


        //part 2 - on click listener with toast
        taskListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                String item = array[i];

                //toast notification to tell user not has been removed
                Toast.makeText(Lab6a.this, item + " clicked",
                        Toast.LENGTH_LONG).show();

            }
        });

        //part 2.2 - open new activity with onLongClick
        taskListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long l) {

                String item = array[i];
               //open new activity

                    Bundle bundle = new Bundle();
                    bundle.putString(MOVIE_KEY,item);

                    Intent listIntent = new Intent(Lab6a.this, Lab6b.class);
                    listIntent.putExtras(bundle);
                    startActivity(listIntent);

                return false;
            }
        });



    }


}

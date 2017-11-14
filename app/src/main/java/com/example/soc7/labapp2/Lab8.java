package com.example.soc7.labapp2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by eric on 28/10/2017.
 */


public class Lab8 extends Activity {

    public Database db = new Database(this);

    public static ArrayList<Task> taskList = new ArrayList<Task>();

    public Button taskBtn = null;
    public static ArrayList<Task> tasks;

    public ListView taskListView = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_lab8); // set layout
       taskListView = findViewById(R.id.task_list_lab8);
        taskBtn = findViewById(R.id.taskListBtn);

        taskBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                //when button is clicked get items from database and put into tasklist
                tasks = db.getTasks();
                Log.d("eric", "got tasks " + tasks.size());

                //format the string to display
                String[] array = new String[tasks.size()];

                for (int i = 0; i < tasks.size(); i++) {
                    String s = "TASK: " + tasks.get(i).getTaskname() + " STATUS: " + tasks.get(i).getStatus();
                    array[i] = s;
                    Log.d("eric", "" + s);

                }//end for




                Toast.makeText(Lab8.this, "Retrieving Tasks",
                        Toast.LENGTH_LONG).show();



                //display using an adapter



                ArrayAdapter adapter = new ArrayAdapter(Lab8.this, android.R.layout.simple_list_item_2, android.R.id.text1, array);

                if(taskListView != null){
                    taskListView.setAdapter(adapter);
                }
                taskListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                        String item = tasks.get(i).getStatus();
                        String message = "";

                        if(item.equals("1")){
                            message = "Task is Complete";
                        }else{
                            message = "Task is not Complete";
                        }

                        //toast notification to tell user not has been removed
                        Toast.makeText(Lab8.this, "" + message,
                                Toast.LENGTH_LONG).show();

                    }
                });



            }
        });


    }//end onCreate


}//end lab8

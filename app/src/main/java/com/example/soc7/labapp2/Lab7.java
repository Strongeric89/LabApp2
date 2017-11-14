package com.example.soc7.labapp2;

/*
* The following lab is for SQLlite  for Android
*
* */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class Lab7 extends Activity {


    private EditText taskname = null;
    private EditText taskstatus = null;
    private Button addTask = null;
    public static ArrayList<Task> taskList = new ArrayList<Task>();

    // creates a new database Database
    public Database db = new Database(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab7);


        taskname = findViewById(R.id.taskName);
        taskstatus = findViewById(R.id.taskStatus);
        addTask = findViewById(R.id.AddMeBtn);

        //create a note
        addTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String name = String.valueOf(taskname.getText());
                String status = String.valueOf(taskstatus.getText());


                Task t = new Task(name,status);
                taskList.add(t);


                Toast.makeText(Lab7.this, "task " + taskList.size() + " added",
                        Toast.LENGTH_LONG).show();

                taskname.setText("");
                taskstatus.setText("");


                Vibrator v = (Vibrator) Lab7.this.getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);
                db.store(t);
                Log.d("eric", t.toString());
            }
        });



    }//end onCreate


}//end Lab7

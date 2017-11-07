package com.example.soc7.labapp2;

/*
* The following lab is for SQLlite  for Android
*
* */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab7 extends Activity {

    private TextView textview = null;
    private EditText taskname = null;
    public static MyDBHelper dbHandler = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab7);

        textview = (TextView) findViewById(R.id.textViewSQL);
        taskname = (EditText) findViewById(R.id.taskName);

        dbHandler = new MyDBHelper(this,null,null,1);
        printDatabase();

    }

    public void addButtonClicked(View view){

        Task task = new Task(taskname.getText().toString());
        dbHandler.addTask(task);
        printDatabase();
    }

    public void deleteButtonClicked(View view){
        String inputText = textview.getText().toString();
        dbHandler.deleteTask(inputText);
        printDatabase();

    }


    public void printDatabase(){
        String dbString = dbHandler.dbToString();
        textview.setText(dbString);
        taskname.setText("");

    }
}

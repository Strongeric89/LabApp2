package com.example.soc7.labapp2;

/**
 * Created by eric on 07/11/2017.
 */

public class Task {

    private int _id;
    private String taskname;


    public Task(String taskname){

            this.taskname = taskname;

    }

    public int get_id() {
        return _id;
    }

    public String getTaskname() {
        return taskname;
    }



    public void set_id(int _id) {
        this._id = _id;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }



}

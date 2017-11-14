package com.example.soc7.labapp2;

/**
 * Created by eric on 07/11/2017.
 */

public class Task {


    private String taskname;
    private String status;


    public Task(String taskname, String status){

            this.taskname = taskname;
            this.status = status;

    }



    public String getTaskname() {
        return taskname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskname='" + taskname + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

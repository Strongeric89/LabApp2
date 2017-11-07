package com.example.soc7.labapp2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by eric on 07/11/2017.
 */

public class MyDBHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "TaskList.db";
    public static final String TABLE_TASKS = "Tasklist";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TASK_NAME = "taskname";


    public MyDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query = "CREATE TABLE " + TABLE_TASKS + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_TASK_NAME + " TEXT "
                + ");";

        Log.d("Eric", query);

        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_TASKS);
        onCreate(sqLiteDatabase);

    }


    // INSERT
    public void addTask(Task task){
        ContentValues v = new ContentValues();

        v.put(COLUMN_TASK_NAME, task.getTaskname());


        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_TASKS, null, v);
        db.close();

    }

    // DELETE
    public void deleteTask(String taskname){

        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_TASKS + " WHERE" + COLUMN_TASK_NAME + "=\"" + taskname + "\";" );
        Log.d("Eric", "DELETE FROM " + TABLE_TASKS + " WHERE" + COLUMN_TASK_NAME + "=\"" + taskname + "\";");
        db.close();

    }

    // SELECT
    public String dbToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_TASKS + " ;";
        Log.d("Eric", query);

        //cursor
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();

        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("taskname")) !=null){
                dbString += c.getString(c.getColumnIndex("taskname"));
                dbString += "\n";

            }
        }
        db.close();
        return dbString;
    }
}

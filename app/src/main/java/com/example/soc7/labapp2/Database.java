package com.example.soc7.labapp2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 14/11/2017.
 */

public class Database extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "TaskList.db";
    public static final String TABLE_NAME = "Tasklist";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TASK_NAME = "taskname";
    public static final String COLUMN_STATUS = "status";

    public Database(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String sql = String.format("CREATE TABLE %s(%s INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT ,%s TEXT);", TABLE_NAME, COLUMN_ID, COLUMN_TASK_NAME, COLUMN_STATUS);

        /*
        *   CREATE TABLE Tasklist(
        *       _id INTEGER PRIMARY KEY AUTOINCREMENT,
        *       taskname TEXT,
        *       taskstatus TEXT
        *   );
        *
        * */

        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public void store(Task t){
        SQLiteDatabase db = getWritableDatabase();


            ContentValues values = new ContentValues();
            values.put(COLUMN_TASK_NAME, t.getTaskname());
            values.put(COLUMN_STATUS, t.getStatus());

            db.insert(TABLE_NAME, null, values);


        db.close();
    }
}

package com.example.soc7.labapp2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;


public class Lab6b extends Activity {

    private TextView text1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6b);

        text1 = findViewById(R.id.movie1);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String s = bundle.getString(Lab6a.MOVIE_KEY);

        text1.setText(s);
    }

}

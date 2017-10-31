package com.example.soc7.labapp2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Lab6c extends Activity {

    public  Movie movieList[] = {
        new Movie("The Dark Knight Rises", "batman returns with epic battle against bane","image4"),
        new Movie("The Dark Knight", "Batman fights the joker", "image4"),
        new Movie("Batman Begins", "Batman fights RasAlgul", "image4")
    };

    private ListView myListView = null;
    private MovieAdapter movieAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6c);

        myListView = (ListView) findViewById(R.id.myListView);
        movieAdapter = new MovieAdapter(getApplicationContext(),R.layout.row,movieList);


        if(myListView != null){
            myListView.setAdapter(movieAdapter);

        }

       //onclick listeners
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("PLACE", movieList[i].title);

                Toast.makeText(Lab6c.this, movieList[i].title + " clicked",
                        Toast.LENGTH_LONG).show();
            }
        });




    }

//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.,menu);
//        return true;
//    }

}

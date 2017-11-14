package com.example.soc7.labapp2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class webScrape extends Activity {

    private TextView textview = null;
    private Button button1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_scrape);

        textview = findViewById(R.id.textView4);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new doit().execute();
            }
        });

    }


  public class doit extends AsyncTask<Void,Void,Void> {
      String words;

      @Override
      protected Void doInBackground(Void... voids) {

          try{
              Document doc = Jsoup.connect("http://www.google.com").get();
                words = doc.text();

          }catch(Exception e){
              e.printStackTrace();
          }

          return null;
      }

      @Override
      protected void onPostExecute(Void aVoid) {
          super.onPostExecute(aVoid);
          textview.setText(words);


      }
  }
}

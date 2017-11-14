package com.example.soc7.labapp2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Vibrator;
import java.util.Date;

public class Lab2 extends Activity {

    private TextView text1 = null;
    private EditText edit1 = null;
    private Button btn1 = null;
    private Button btn2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab2);

        text1 = findViewById(R.id.textView);
        edit1 = findViewById(R.id.editMe);
        btn1 = findViewById(R.id.clickMeBtn);
        //when button clicked

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(Lab2.this, "OUCH!!! You clicked me!!",
                        Toast.LENGTH_LONG).show();


                //change the text in the editText
                String edited = String.valueOf(edit1.getText());
                text1.setText(edited);



                Vibrator v = (Vibrator) Lab2.this.getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);
            }
        });



        btn2 = findViewById(R.id.time);
        //when button clicked

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Date now = new Date();
                String s = now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds();
                btn2.setText(s);

                Vibrator v = (Vibrator) Lab2.this.getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);

            }
        });











    }//end on Create







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}//end main Activity

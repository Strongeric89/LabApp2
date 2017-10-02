package com.example.soc7.labapp2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by eric on 02/10/2017.
 */

public class Lab3 extends Activity {

    private CheckBox checkbox = null;
    private ImageView bgImage = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab3);

        bgImage = (ImageView) findViewById(R.id.imageBG);
        bgImage.setImageResource(R.drawable.image2);


        checkbox = (CheckBox) findViewById(R.id.checkBox);
        checkbox.setChecked(false);

        checkbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



                if(checkbox.isChecked()){
                    checkbox.setText("Checked!");
                    Toast.makeText(Lab3.this, "You checked the checkbox!", Toast.LENGTH_LONG).show();

                    bgImage.setImageResource(R.drawable.image1);

                    Vibrator v = (Vibrator) Lab3.this.getSystemService(Context.VIBRATOR_SERVICE);
                    v.vibrate(500);

                }//end if]

                if(!checkbox.isChecked()){
                    checkbox.setText("unchecked!");
                    Toast.makeText(Lab3.this, "You unchecked the checkbox!", Toast.LENGTH_LONG).show();

                    bgImage.setImageResource(R.drawable.image2);

                    Vibrator v = (Vibrator) Lab3.this.getSystemService(Context.VIBRATOR_SERVICE);
                    v.vibrate(500);


                }



            }
        });

    }//end onCreate
}//end Lab3

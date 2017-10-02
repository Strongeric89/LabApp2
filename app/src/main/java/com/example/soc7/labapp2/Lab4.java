package com.example.soc7.labapp2;

import android.app.Activity;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import android.provider.MediaStore;
import android.view.Gravity;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.soc7.labapp2.R.id.orientation;


/**
 * Created by eric on 02/10/2017.
 */

public class Lab4 extends Activity implements View.OnClickListener {

    private RadioButton rbH = null;
    private RadioButton rbV = null;
    private RadioButton rbL = null;
    private RadioButton rbC = null;
    private RadioButton rbR = null;
    private RadioGroup g1 = null;
    private RadioGroup g2 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab4);

        // setting the orientation
        rbH = (RadioButton) findViewById(R.id.horizontal);
        rbH.setOnClickListener(this);
        rbV = (RadioButton) findViewById(R.id.vertical);
        rbV.setOnClickListener(this);
        rbL = (RadioButton) findViewById(R.id.left);
        rbL.setOnClickListener(this);
        rbC = (RadioButton) findViewById(R.id.center);
        rbC.setOnClickListener(this);
        rbR = (RadioButton) findViewById(R.id.right);
        rbR.setOnClickListener(this);

    }//end onCreate


    @Override
    public void onClick(View view) {
        RadioGroup g1 = (RadioGroup) findViewById(orientation);
        RadioGroup g2 = (RadioGroup) findViewById(R.id.gravity);


        switch (view.getId()) {


            case R.id.horizontal:
                g1.setOrientation(LinearLayout.HORIZONTAL);
                Toast.makeText(Lab4.this, "Horizontal!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.vertical:
                g1.setOrientation(LinearLayout.VERTICAL);
                Toast.makeText(Lab4.this, "Vertical!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.left:

                rbC.setGravity(Gravity.LEFT);
                rbL.setGravity(Gravity.LEFT);
                rbR.setGravity(Gravity.LEFT);
                Toast.makeText(Lab4.this, "Left!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.center:
                rbC.setGravity(Gravity.CENTER);
                rbL.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
                rbR.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
                Toast.makeText(Lab4.this, "Center!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.right:

                rbC.setGravity(Gravity.RIGHT);
                rbL.setGravity(Gravity.RIGHT);
                rbR.setGravity(Gravity.RIGHT);
                Toast.makeText(Lab4.this, "right!", Toast.LENGTH_SHORT).show();
                break;


            default:
                break;
        }

    }
}//end Lab3

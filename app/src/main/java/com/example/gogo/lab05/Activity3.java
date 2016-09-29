package com.example.gogo.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    @Override
    protected void onActivityResult(int request, int result, Intent i) {

        String s = "";
        if(i == null)
        {
            s = "nothing do display";
        }
        else
        {
            i.getExtras().getString("g");
        }
        i.putExtra("g", s);
        Intent i2 = new Intent();

        i2.putExtra("g", s+" request"+request);
        setResult(RESULT_OK, i2);
        finish();
    }

    public void btn4(View v)
    {
        startActivityForResult(new Intent(this, Activity4.class), 4);
    }

    public void btn5(View v)
    {
        startActivityForResult(new Intent(this, Activity5.class), 5);
    }

}

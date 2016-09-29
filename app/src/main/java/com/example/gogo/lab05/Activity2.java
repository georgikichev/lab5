package com.example.gogo.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        }

    public void btn1(View v)
    {
        Intent i = new Intent();

        i.putExtra("key", "Activity 2: One, 1, uno, un/une");
        setResult(RESULT_OK, i);
        finish();
    }

    public void btn2(View v)
    {
        Intent i = new Intent();

        i.putExtra("g", "Activity 2: Two, 2 , due, deux");
        setResult(RESULT_OK, i);
        finish();
    }

}

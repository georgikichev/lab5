package com.example.gogo.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    @Override
    public void finish() {
        Intent i = new Intent();

        i.putExtra("g", "Dave. I'm afraid I can't do that.");

        setResult(RESULT_OK, i);
        super.finish();
    }

}

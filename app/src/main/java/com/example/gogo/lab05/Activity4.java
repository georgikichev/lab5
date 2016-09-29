package com.example.gogo.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void click(View view) {
        String s = ((EditText)findViewById(R.id.returnText)).getText().toString();

        if(s.isEmpty())
        {
            s = "nothing to display";
        }
        Intent i = new Intent();
        i.putExtra("g", s);

        setResult(RESULT_OK, i);
        finish();
    }

}

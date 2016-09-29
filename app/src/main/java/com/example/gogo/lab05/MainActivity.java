package com.example.gogo.lab05;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchBrowser(View v)
    {
        Intent i = new Intent();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com")));
    }

    public void launchMaps(View v)
    {
        Intent i = new Intent();
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Montreal")));
    }

    public void launch2(View v)
    {
        Intent i = new Intent();
        startActivityForResult(new Intent(this, Activity2.class), 2);
    }

    public void launch3(View v)
    {
        Intent i = new Intent();
        startActivityForResult(new Intent(this, Activity3.class), 3);
    }

    @Override
    protected void onActivityResult(int request, int result, Intent i) {
        TextView v = (TextView)findViewById(R.id.displayResults);

        String s = "";
        if(i == null)
        {
            s = "nothing do display";
        }
        else
        {
           i.getExtras().getString("g");
        }

        v.setText(String.format(getResources().getString(R.string.result_main), request, s));
    }
}

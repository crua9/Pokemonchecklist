package com.techreviewsandhelp.pokemonchecklist;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    final Context c = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        Button checklist = (Button)findViewById(R.id.checklist);
        Button chart = (Button)findViewById(R.id.charts);
        Button search = (Button)findViewById(R.id.search);

        //Textview
        TextView random_info = (TextView)findViewById(R.id.random_info);
        TextView news = (TextView)findViewById(R.id.news);

        //Image
        ImageView logo = (ImageView)findViewById(R.id.logo);


        //Checklsit button

        checklist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, Checklist.class));
                finish();
            }
        });
        //Chart button
        chart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, Chart.class));
                finish();
            }
        });
        //Search Button
        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, Search.class));
                finish();
            }
        });

        /**
         * The random info needs the save feature, and the news needs to be looked at. (I wonder
         * if there is any RSS news out there that the thing can read. If so, this could act as a ticker)
         * The logo is going to be as it is untill I can get a logo for this app. That or it will just go away.
         */

    }


}

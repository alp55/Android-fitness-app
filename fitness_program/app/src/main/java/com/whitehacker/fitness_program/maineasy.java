package com.whitehacker.fitness_program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class maineasy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maineasy);
    }
    public void monday(View view)
    {
        Intent gonder = new Intent(maineasy.this,mondayeasy.class);
        startActivity(gonder);
    }
    public void tues(View view)
    {
        Intent gonder = new Intent(maineasy.this,tueseasy.class);
        startActivity(gonder);
    }
    public void wed(View view)
    {
        Intent gonder = new Intent(maineasy.this,wedeasy.class);
        startActivity(gonder);
    }
    public void thur(View view)
    {
        Intent gonder = new Intent(maineasy.this,thureasy.class);
        startActivity(gonder);
    }
    public void fri(View view)
    {
        Intent gonder = new Intent(maineasy.this,frieasy.class);
        startActivity(gonder);
    }
    public void satur(View view)
    {
        Intent gonder = new Intent(maineasy.this,easysatur.class);
        startActivity(gonder);
    }
}
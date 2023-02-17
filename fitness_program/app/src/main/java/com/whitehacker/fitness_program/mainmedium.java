package com.whitehacker.fitness_program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainmedium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmedium);
    }



    public void mon(View view)
    {
        Intent gonder = new Intent(mainmedium.this,midmon.class);
        startActivity(gonder);
    }
    public void tues(View view)
    {
        Intent gonder = new Intent(mainmedium.this,tuesmid.class);
        startActivity(gonder);
    }
    public void wed(View view)
    {
        Intent gonder = new Intent(mainmedium.this,midwen.class);
        startActivity(gonder);
    }
    public void trus(View view)
    {
        Intent gonder = new Intent(mainmedium.this,midtrus.class);
        startActivity(gonder);
    }

    public void satur(View view)
    {
        Intent gonder = new Intent(mainmedium.this,midsatur.class);
        startActivity(gonder);
    }
}
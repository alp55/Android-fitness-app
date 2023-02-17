package com.whitehacker.fitness_program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainhard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhard);
    }

    public void tues(View view)
    {
        Intent gonder = new Intent(mainhard.this,hardtues.class);
        startActivity(gonder);
    }

    public void wed(View view)
    {
        Intent gonder = new Intent(mainhard.this,hardwed.class);
        startActivity(gonder);
    }
    public void fri(View view)
    {
        Intent gonder = new Intent(mainhard.this,hardfri.class);
        startActivity(gonder);
    }
    public void satur(View view)
    {
        Intent gonder = new Intent(mainhard.this,hardsatur.class);
        startActivity(gonder);
    }
    public void mon(View view)
    {
        Intent gonder = new Intent(mainhard.this,hardmon.class);
        startActivity(gonder);
    }
}
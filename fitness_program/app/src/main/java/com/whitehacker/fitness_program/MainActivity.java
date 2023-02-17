package com.whitehacker.fitness_program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void hard(View view)
    {
        Intent gonder = new Intent(MainActivity.this,mainhard.class);
        startActivity(gonder);
    }

    public void easy(View view)
    {
        Intent gonder = new Intent(MainActivity.this,maineasy.class);
        startActivity(gonder);
    }
    public void medium(View view)
    {
        Intent gonder = new Intent(MainActivity.this,mainmedium.class);
        startActivity(gonder);
    }

}
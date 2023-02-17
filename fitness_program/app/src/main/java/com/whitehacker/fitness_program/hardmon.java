package com.whitehacker.fitness_program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class hardmon extends AppCompatActivity {

    int c=0;
    ImageView fotograf;
    TextView text;

    private Integer[] fotograflist={

            R.drawable.bench_press,
            R.drawable.inclinedumbellpress,
            R.drawable.cablefly,
            R.drawable.overheadpress,
            R.drawable.lateralraise,
            R.drawable.latpulldown,
            R.drawable.tricepspushdown,
    };
    private String[] textlist={
            "4 SET 12 REPS",
            "4 SET 10 REPS",
            "4 SET 12 REPS",
            "4 SET 10 REPS",
            "4 SET 12 REPS",
            "4 SET 10 REPS",
            "4 SET 12 REPS",



    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardmon);
        fotograf=(ImageView)findViewById(R.id.goruntuleyici);
        text=(TextView) findViewById(R.id.text);
        fotograf.setBackgroundResource(fotograflist[c]);
        text.setText(""+textlist[c]);



    }

    public void sag(View view)
    {
        if(c>=0 && c<6)
        {
            c=c+1;
            fotograf.setBackgroundResource(fotograflist[c]);
            text.setText(""+textlist[c]);

        }
        else
        {
            c=0;
            fotograf.setBackgroundResource(fotograflist[c]);
            text.setText(""+textlist[c]);

        }

    }
    public void sol(View view)
    {
        if(c<=6 && c>0)
        {
            c=c-1;
            fotograf.setBackgroundResource(fotograflist[c]);
            text.setText(""+textlist[c]);

        }
        else
        {
            c=6;
            fotograf.setBackgroundResource(fotograflist[c]);
            text.setText(""+textlist[c]);

        }
    }

}
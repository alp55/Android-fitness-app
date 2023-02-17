package com.whitehacker.fitness_program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class mondayeasy extends AppCompatActivity {
    int c=0;
    ImageView fotograf;
    TextView text;

    private Integer[] fotograflist={

            R.drawable.chesspress,
            R.drawable.cablefly,
            R.drawable.inclinedumbellpress,
            R.drawable.latpulldown
    };
    private String[] textlist={
            "4 SET 12 REPS",
            "4 SET 12 REPS",
            "4 SET 8 REPS",
            "4 SET 10 REPS",




    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mondayeasy);
        fotograf=(ImageView)findViewById(R.id.goruntuleyici);
        text=(TextView) findViewById(R.id.text);
        text.setText(""+textlist[c]);



    }

    public void sag(View view)
    {
        if(c>=0 && c<3)
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
        if(c<=3 && c>0)
        {
            c=c-1;
            fotograf.setBackgroundResource(fotograflist[c]);
            text.setText(""+textlist[c]);

        }
        else
        {
            c=3;
            fotograf.setBackgroundResource(fotograflist[c]);
            text.setText(""+textlist[c]);

        }
    }
}
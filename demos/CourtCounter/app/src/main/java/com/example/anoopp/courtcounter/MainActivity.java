package com.example.anoopp.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAPoint=0;
    int teamBPoint=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view)
    {
        teamAPoint=0;
        teamBPoint=0;
        displayPoint();
    }

    public void displayPoint()
    {
        TextView teamATextView = (TextView) findViewById(R.id.teamaScore);
        TextView teamBTextView = (TextView) findViewById(R.id.teambScore);
        teamATextView.setText(""+teamAPoint);
        teamBTextView.setText(""+teamBPoint);
    }

    public void add3(View view)
    {
        int buttonId=view.getId();
        if(R.id.teama3 == buttonId)
        {
            teamAPoint=teamAPoint+3;
        }
        else if(R.id.teamb3 == buttonId)
        {
            teamBPoint=teamBPoint+3;
        }
        displayPoint();
    }
    public void add2(View view)
    {
        int buttonId=view.getId();
        if(R.id.teama2 == buttonId)
        {
            teamAPoint=teamAPoint+2;
        }
        else if(R.id.teamb2 == buttonId)
        {
            teamBPoint=teamBPoint+2;
        }
        displayPoint();
    }
    public void addFreeThrow(View view)
    {
        int buttonId=view.getId();
        if(R.id.teamaFreethrow == buttonId)
        {
            teamAPoint=teamAPoint+1;
        }
        else if(R.id.teambFreeThrow == buttonId)
        {
            teamBPoint=teamBPoint+1;
        }
        displayPoint();
    }
}

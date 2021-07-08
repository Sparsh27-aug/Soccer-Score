package com.sparsh.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void touchdownA(View v) {
        scoreA += 6;
        displayA(scoreA);
    }

    public void touchdownB(View v) {
        scoreB += 6;
        displayB(scoreB);
    }

    public void fieldgoalA(View v) {
        scoreA += 3;
        displayA(scoreA);
    }

    public void fieldgoalB(View v) {
        scoreB += 3;
        displayB(scoreB);
    }

    public void safetyA(View v) {
        scoreA += 2;
        displayA(scoreA);
    }

    public void safetyB(View v) {
        scoreB += 2;
        displayB(scoreB);
    }

    public void tryafterA(View v) {
        scoreA += 1;
        displayA(scoreA);
    }

    public void tryafterB(View v) {
        scoreB += 1;
        displayB(scoreB);
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    public void displayA(int s) {
        TextView scoreViewA = (TextView) findViewById(R.id.scoreTeamA);
        scoreViewA.setText("" + s);
    }

    public void displayB(int s) {
        TextView scoreViewB = (TextView) findViewById(R.id.scoreTeamB);
        scoreViewB.setText("" + s);
    }
}
package com.example.cricketscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int t1score=0;
    private int t2score=0;
    private TextView mShowScoret1;
    private TextView mShowScoret2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowScoret1 = (TextView) findViewById(R.id.show_t1score);
        mShowScoret2 = (TextView) findViewById(R.id.show_t2score);
    }

    public void addSixRuns(View view) {
        t1score=t1score+6;
        if (mShowScoret1 != null)
            mShowScoret1.setText(Integer.toString(t1score));
    }

    public void addFourRuns(View view) {
        t1score=t1score+4;
        if (mShowScoret1 != null)
            mShowScoret1.setText(Integer.toString(t1score));
    }

    public void addThreeRuns(View view) {
        t1score=t1score+3;
        if (mShowScoret1 != null)
            mShowScoret1.setText(Integer.toString(t1score));
    }

    public void addTwoRuns(View view) {
        t1score=t1score+2;
        if (mShowScoret1 != null)
            mShowScoret1.setText(Integer.toString(t1score));
    }

    public void addOneRuns(View view) {
        t1score=t1score+1;
        if (mShowScoret1 != null)
            mShowScoret1.setText(Integer.toString(t1score));
    }

    public void gameFinish(View view) {
        Toast toast;
        if (t1score > t2score){
            toast = Toast.makeText(this, R.string.toast_message1, Toast.LENGTH_SHORT);
        }
        else {
            toast = Toast.makeText(this, R.string.toast_message2, Toast.LENGTH_SHORT);
        }
        toast.show();
        toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void scoreReset(View view) {
        t1score=0;
        t2score=0;
        if (mShowScoret1 != null)
            mShowScoret1.setText(Integer.toString(t1score));
        if (mShowScoret2 != null)
            mShowScoret2.setText(Integer.toString(t2score));
    }

    public void addFourRuns2(View view) {
        t2score=t2score+4;
        if (mShowScoret2 != null)
            mShowScoret2.setText(Integer.toString(t2score));
    }

    public void addThreeRuns2(View view) {
        t2score=t2score+3;
        if (mShowScoret2 != null)
            mShowScoret2.setText(Integer.toString(t2score));
    }

    public void addTwoRuns2(View view) {
        t2score=t2score+2;
        if (mShowScoret2 != null)
            mShowScoret2.setText(Integer.toString(t2score));
    }

    public void addOneRuns2(View view) {
        t2score=t2score+1;
        if (mShowScoret2 != null)
            mShowScoret2.setText(Integer.toString(t2score));
    }

    public void addSixRuns2(View view) {
        t2score=t2score+6;
        if (mShowScoret2 != null)
            mShowScoret2.setText(Integer.toString(t2score));
    }
}
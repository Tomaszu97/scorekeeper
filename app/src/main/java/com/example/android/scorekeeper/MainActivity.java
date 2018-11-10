package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int t1Points;
    int t1Fouls;
    int t2Points;
    int t2Fouls;
    TextView t1PointsText;
    TextView t1FoulsText;
    TextView t2PointsText;
    TextView t2FoulsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1Points=0;
        t1Fouls=0;
        t2Points=0;
        t2Fouls=0;
        t1PointsText = findViewById(R.id.t1_points);
        t1FoulsText = findViewById(R.id.t1_fouls);
        t2PointsText = findViewById(R.id.t2_points);
        t2FoulsText = findViewById(R.id.t2_fouls);

    }

    public void onClick(View view)
    {
        Log.d("dupa", "gowno");
        switch(view.getId())
        {
            case R.id.b_increase_t1_points:
                t1Points++;
                break;
            case R.id.b_decrease_t1_points:
                t1Points--;
                break;
            case R.id.b_increase_t1_fouls:
                t1Fouls++;
                break;
            case R.id.b_decrease_t1_fouls:
                t1Fouls--;
                break;
            case R.id.b_increase_t2_points:
                t2Points++;
                break;
            case R.id.b_decrease_t2_points:
                t2Points--;
                break;
            case R.id.b_increase_t2_fouls:
                t2Fouls++;
                break;
            case R.id.b_decrease_t2_fouls:
                t2Fouls--;
                break;
        }

        t1PointsText.setText(Integer.toString(t1Points));
        t1FoulsText.setText(Integer.toString(t1Fouls));
        t2PointsText.setText(Integer.toString(t2Points));
        t2FoulsText.setText(Integer.toString(t2Fouls));
    }
}

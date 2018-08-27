package com.bmacode17.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHT = "Weight lifting";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String EXERCISE_YOGA = "yoga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mRelativeLayout_weight = (RelativeLayout) findViewById(R.id.relativeLayout_weight);
        RelativeLayout mRelativeLayout_heart = (RelativeLayout) findViewById(R.id.relativeLayout_cardio);
        RelativeLayout mRelativeLayout_youga = (RelativeLayout) findViewById(R.id.relativeLayout_yoga);

        mRelativeLayout_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load_Activity_Details(MainActivity.EXERCISE_WEIGHT);
            }
        });

        mRelativeLayout_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load_Activity_Details(MainActivity.EXERCISE_CARDIO);
            }
        });

        mRelativeLayout_youga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load_Activity_Details(MainActivity.EXERCISE_YOGA);
            }
        });
    }

    private void load_Activity_Details(String exerciseTitle){
        Intent mIntent = new Intent(MainActivity.this,Activity_Details.class);
        Bundle b = new Bundle();
        b.putString("EXERCISE_TITLE",exerciseTitle);
        mIntent.putExtras(b);
        startActivity(mIntent);
    }
}

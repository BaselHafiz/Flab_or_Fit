package com.bmacode17.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__details);

        TextView textView_exerciseTitle = (TextView) findViewById(R.id.textView_exerciseTitle);
        ImageView imageView_exerciseImage = (ImageView) findViewById(R.id.imageView_exerciseImage);
        LinearLayout linearLayout_first = (LinearLayout) findViewById(R.id.linearLayout_first);
        LinearLayout linearLayout_second = (LinearLayout) findViewById(R.id.linearLayout_second);

        Bundle b = getIntent().getExtras();
        String exerciseTitle = b.getString("EXERCISE_TITLE");
        switch(exerciseTitle){
            case MainActivity.EXERCISE_CARDIO:
                textView_exerciseTitle.setText("Cardio");
                imageView_exerciseImage.setImageResource(R.drawable.heart);

                linearLayout_first.setBackgroundColor(Color.parseColor("#9D6ED1"));
                break;
            case MainActivity.EXERCISE_YOGA:
                textView_exerciseTitle.setText("Yoga");
                imageView_exerciseImage.setImageResource(R.drawable.lotus);
                linearLayout_first.setBackgroundColor(Color.parseColor("#66C466"));

                break;

        }
    }
}

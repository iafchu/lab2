package com.selab.helloaroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView counterTextView;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        counterTextView = findViewById(R.id.counterTextView);
        countButton = findViewById(R.id.countButton);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });
    }
}
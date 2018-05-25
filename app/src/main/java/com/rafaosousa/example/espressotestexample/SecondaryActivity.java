package com.rafaosousa.example.espressotestexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView textViewSecondary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Integer extra = getIntent().getIntExtra("extra", 0);

        textViewSecondary = findViewById(R.id.textview_secondary);
        textViewSecondary.setText(String.valueOf(extra));
    }
}

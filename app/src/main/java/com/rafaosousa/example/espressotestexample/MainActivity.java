package com.rafaosousa.example.espressotestexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewMain;
    Button buttonMain, buttonSecondary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMain = (TextView) findViewById(R.id.textview_main);
        textViewMain.setText(getResources().getString(R.string.hello_world));

        buttonMain = (Button) findViewById(R.id.button_main);
        buttonMain.setText(getResources().getString(R.string.button_main));
        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMain.setText(getResources().getString(R.string.hello_world_with_espresso));
            }
        });

        buttonSecondary = (Button) findViewById(R.id.button_secondary);
        buttonSecondary.setText(getResources().getString(R.string.button_secondary));
        buttonSecondary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 13546879;
                Intent intent = new Intent(getBaseContext(), SecondaryActivity.class);
                intent.putExtra("extra", i);
                startActivity(intent);
            }
        });
    }
}

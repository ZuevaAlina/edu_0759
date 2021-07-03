package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        TextView singleName = (TextView) findViewById(R.id.singleName);
        Intent intent2 = getIntent();
        singleName.setText(intent2.getStringExtra("name"));

    }
}

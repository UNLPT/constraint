package com.example.constraint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size=30;

    public void bigger(View v){
        TextView hello;
        hello = findViewById(R.id.textView);
        hello.setTextSize(++size);
    }
}

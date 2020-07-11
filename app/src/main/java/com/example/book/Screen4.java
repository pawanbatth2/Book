package com.example.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }

    public void onClick(View view) {

        Intent i = new Intent(Screen4.this, Screen1.class);
        startActivity(i);
    }
}

package com.dt.lattedb;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Intro extends AppCompatActivity {
    Variable variable = new Variable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
    }
}

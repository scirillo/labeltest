package com.example.labelred;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.labelred.ui.main.LabelRedFragment;

public class LabelRed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.label_red_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LabelRedFragment.newInstance())
                    .commitNow();
        }
    }
}
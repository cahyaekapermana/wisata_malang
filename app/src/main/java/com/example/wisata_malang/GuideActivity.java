package com.example.wisata_malang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
    }

    public void handleBack(View view) {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}

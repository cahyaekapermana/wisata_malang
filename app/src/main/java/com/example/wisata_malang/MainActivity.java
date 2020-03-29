package com.example.wisata_malang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Exit Button
    public void handleExit(View view) {
        finish();
        System.exit(0);
    }

    public void handleMasuk(View view) {
        
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

package com.example.wisata_malang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public EditText username;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.input_username);
        password = findViewById(R.id.input_password);
    }


    public void handleLogin(View view) {
        if (username.getText().toString().equals("cahya") && password.getText().toString().equals("cahya")) {

            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);

        } else {

            Toast.makeText(view.getContext(), "Username atau password salah!", Toast.LENGTH_LONG).show();
        }
    }

    public void hanldePetunjuk(View view) {

        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);

    }
}

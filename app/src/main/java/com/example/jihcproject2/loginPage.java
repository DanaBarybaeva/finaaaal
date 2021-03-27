package com.example.jihcproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginPage extends AppCompatActivity implements View.OnClickListener {
    Button kiru;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        kiru = findViewById(R.id.kiru);
        kiru.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.kiru) {
            Intent kiru = new Intent(this, bastyBet.class);
            startActivity(kiru);
        } else {
            Intent kiru = new Intent(this, loginPage.class);
            startActivity(kiru);
        }

        }
    }
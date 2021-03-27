package com.example.jihcproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class whoAreYouPage extends AppCompatActivity implements View.OnClickListener{
    Button teacherbutton,okushybutton,qonaqbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_are_you_page);

        teacherbutton = findViewById(R.id.buttonteacher);
        okushybutton = findViewById(R.id.buttonokushy);
        qonaqbutton = findViewById(R.id.buttonqonaq);

        qonaqbutton.setOnClickListener(this);
        okushybutton.setOnClickListener(this);
        teacherbutton.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonokushy){
            Intent tikelu = new Intent(this,loginPage.class);
            startActivity(tikelu);
        }
        else if(v.getId() == R.id.buttonqonaq){
            Intent tikelu = new Intent(this,loginPage.class);
            startActivity(tikelu);
        }
        else{
            Intent tikelu = new Intent(this,loginPage.class);
            startActivity(tikelu);
        }

    }
}
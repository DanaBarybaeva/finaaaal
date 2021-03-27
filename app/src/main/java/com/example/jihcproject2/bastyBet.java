package com.example.jihcproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bastyBet extends AppCompatActivity implements View.OnClickListener{
    Button uirmeler,buhgalteria,sabaqkestesi,kitaphana;
    ImageButton btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basty_bet);

        uirmeler = findViewById(R.id.btnuirmeler);
        buhgalteria = findViewById(R.id.btnbuhgalteria);
        sabaqkestesi = findViewById(R.id.btnsabaqkestesi);
        kitaphana = findViewById(R.id.btnkitaphana);
        btnnext = findViewById(R.id.btnnext);

        kitaphana.setOnClickListener(this);
        uirmeler.setOnClickListener(this);
        buhgalteria.setOnClickListener(this);
        sabaqkestesi.setOnClickListener(this);
        btnnext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnkitaphana){
            Intent tikelu = new Intent(this,kitaphanaPage.class);
            startActivity(tikelu);
        }
        else if(v.getId() == R.id.btnuirmeler){
            Intent tikelu = new Intent(this,uirmelerPage.class);
            startActivity(tikelu);
        }
        else if(v.getId() == R.id.btnnext){
            Intent tikelu = new Intent(this,mugalimderPage.class);
            startActivity(tikelu);
        }
        else{
            Intent tikelu = new Intent(this,buhgalteriaPage.class);
            startActivity(tikelu);
        }
    }
}
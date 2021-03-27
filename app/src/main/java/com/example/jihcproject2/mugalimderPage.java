package com.example.jihcproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class mugalimderPage extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Mugalim> mugalimderlist;
    private RecyclerView.LayoutManager LinearLayoutManager, gridLayoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugalimder_page);

        recyclerView = findViewById(R.id.recyclerView);


        mugalimderlist = new ArrayList<>();
        mugalimderlist.add(new Mugalim(R.drawable.mugalim01,"Saulebai Almaz","economy","synyby:2C"));
        mugalimderlist.add(new Mugalim(R.drawable.mugalim02,"Kazangapov Bakytzhan","graph desing","synyby:3E"));
        mugalimderlist.add(new Mugalim(R.drawable.mugalim03,"Sadyqova Aliya","tarih","synyby:1B1"));
        mugalimderlist.add(new Mugalim(R.drawable.mugalim04,"Zhanat hocam","turkce","synyby:2a"));
        mugalimderlist.add(new Mugalim(R.drawable.mugalim05,"Nurgul Apai","statistics","synyby:3A"));
        mugalimderlist.add(new Mugalim(R.drawable.mugalim06,"Ms Aziza","english","synyby:3F"));


        recyclerViewAdapter = new RecyclerViewAdapter(this,mugalimderlist);

        LinearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this,1);

        recyclerView.setLayoutManager(LinearLayoutManager);



        recyclerView.setAdapter(recyclerViewAdapter);




    }
}

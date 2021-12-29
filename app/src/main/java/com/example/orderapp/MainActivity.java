package com.example.orderapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // creatie an array
        modelList = new ArrayList<>();
        modelList.add(new Model("Green Tea"," ", R.drawable.greentea ));
        modelList.add(new Model("Latte", "", R.drawable.late));
        modelList.add(new Model("Orange Smoothie", "", R.drawable.orange));
        modelList.add(new Model("Orange Vanilla", "", R.drawable.orangevanilla));
        modelList.add(new Model("Cappucino","", R.drawable.cappcunio));
        modelList.add(new Model("Thai Tea", "", R.drawable.thaitea));
        modelList.add(new Model("Tea", "", R.drawable.tea));
        modelList.add(new Model("Bubble Tea", "", R.drawable.milk));
        modelList.add(new Model("Matcha", "", R.drawable.match));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));

        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);




    }
}
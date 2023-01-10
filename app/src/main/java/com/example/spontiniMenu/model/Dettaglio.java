package com.example.spontiniMenu.model;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spontiniMenu.adapter.DettaglioAdapter;
import com.example.spontiniMenu.R;

public class Dettaglio extends AppCompatActivity {
    private TextView textView;
    private RecyclerView recyclerView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ristorante);
        textView= findViewById(R.id.nomeRistorante);
        imageView=findViewById(R.id.imageView4);
        Pizza pizza = (Pizza) getIntent().getSerializableExtra("ristorante");
        textView.setText(pizza.getName());
        imageView.setImageResource(pizza.getImage());
        recyclerView= findViewById(R.id.recycler1);
        DettaglioAdapter dettaglioAdapter = new DettaglioAdapter(pizza.getPiattiArray().toArray(new String[0]));
        recyclerView.setAdapter(dettaglioAdapter);
    }
}
package com.example.spontiniMenu;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spontiniMenu.adapter.PizzaAdapter;
import com.example.spontiniMenu.model.Dettaglio;
import com.example.spontiniMenu.model.Pizza;
import com.example.spontiniMenu.R;


import java.util.ArrayList;

public class Main extends Fragment implements RecyclerViewInterface  {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_main, container, false);
        return  view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<String> margherita= new ArrayList<>();
        margherita.add("Pomodoro");
        margherita.add("Mozzarella");
        margherita.add("Origano");

        ArrayList<String> margheritaDoppiaMozzarella= new ArrayList<>();
        margheritaDoppiaMozzarella.add("Pomodoro");
        margheritaDoppiaMozzarella.add("Doppia mozzarella");
        margheritaDoppiaMozzarella.add("Origano");

        ArrayList<String> mediterranea= new ArrayList<>();
        mediterranea.add("Pomodoro");
        mediterranea.add("Olive nere");
        mediterranea.add("Capperi");
        mediterranea.add("Acciughe");
        mediterranea.add("Origano");

        ArrayList<String> ortolana= new ArrayList<>();
        ortolana.add("Pomodoro");
        ortolana.add("Mozzarella");
        ortolana.add("Zucchine");
        ortolana.add("Melanazana");
        ortolana.add("Peperoni");
        ortolana.add("Origano");

        ArrayList<String> prosciuttoCotto= new ArrayList<>();
        prosciuttoCotto.add("Pomodoro");
        prosciuttoCotto.add("Mozzarella");
        prosciuttoCotto.add("Prosciutto cotto");
        prosciuttoCotto.add("Origano");

        Pizza[] pizzas ={
                new Pizza("Margherita",R.drawable.ic_launcher_background,"ristorante di pesce specializzato in primi piatti\npesce sempre fresco",margherita),
                new Pizza("Margherita doppia mozzarella",R.drawable.ic_launcher_background,"pizzeria partenopea con forno a legna ",margherita),
                new Pizza("Meiterranea",R.drawable.ic_launcher_background,"Le migliori Poke Bowl le trovi solo da noi",mediterranea),
                new Pizza("Ortolana",R.drawable.ic_launcher_background,"Le migliori Poke Bowl le trovi solo da noi",ortolana),
                new Pizza("Prosciutto cotto",R.drawable.ic_launcher_background,"Le migliori Poke Bowl le trovi solo da noi",prosciuttoCotto),
        };
        recyclerView= view.findViewById(R.id.recycler);
        PizzaAdapter pizzaAdapter = new PizzaAdapter(pizzas,this);
        recyclerView.setAdapter(pizzaAdapter);
    }

    @Override
    public void OnItemClick(int position) {
        ArrayList<String> margherita= new ArrayList<>();
        margherita.add("Pomodoro");
        margherita.add("Mozzarella");
        margherita.add("Origano");

        ArrayList<String> margheritaDoppiaMozzarella= new ArrayList<>();
        margheritaDoppiaMozzarella.add("Pomodoro");
        margheritaDoppiaMozzarella.add("Doppia mozzarella");
        margheritaDoppiaMozzarella.add("Origano");

        ArrayList<String> mediterranea= new ArrayList<>();
        mediterranea.add("Pomodoro");
        mediterranea.add("Olive nere");
        mediterranea.add("Capperi");
        mediterranea.add("Acciughe");
        mediterranea.add("Origano");

        ArrayList<String> ortolana= new ArrayList<>();
        ortolana.add("Pomodoro");
        ortolana.add("Mozzarella");
        ortolana.add("Zucchine");
        ortolana.add("Melanazana");
        ortolana.add("Peperoni");
        ortolana.add("Origano");

        ArrayList<String> prosciuttoCotto= new ArrayList<>();
        prosciuttoCotto.add("Pomodoro");
        prosciuttoCotto.add("Mozzarella");
        prosciuttoCotto.add("Prosciutto cotto");
        prosciuttoCotto.add("Origano");

        Pizza[] pizzas ={
                new Pizza("Margherita",R.drawable.ic_launcher_background,"ristorante di pesce specializzato in primi piatti\npesce sempre fresco",margherita),
                new Pizza("Margherita doppia mozzarella",R.drawable.ic_launcher_background,"pizzeria partenopea con forno a legna ",margherita),
                new Pizza("Meiterranea",R.drawable.ic_launcher_background,"Le migliori Poke Bowl le trovi solo da noi",mediterranea),
                new Pizza("Ortolana",R.drawable.ic_launcher_background,"Le migliori Poke Bowl le trovi solo da noi",ortolana),
                new Pizza("Prosciutto cotto",R.drawable.ic_launcher_background,"Le migliori Poke Bowl le trovi solo da noi",prosciuttoCotto),
        };

        Intent intent = new Intent(getActivity(), Dettaglio.class);
        intent.putExtra("ristorante", pizzas[position]);
        startActivity(intent);
    }



}
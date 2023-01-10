package com.example.luccodeliveryandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.luccodeliveryandroid.R;
import com.example.luccodeliveryandroid.RecyclerViewInterface;
import com.example.luccodeliveryandroid.model.Pizza;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.ProjectViewHolder> implements RecyclerViewInterface {
    private final Pizza[] pizzas;
    private final RecyclerViewInterface recyclerViewInterface;

    public PizzaAdapter(Pizza[] pizzas, RecyclerViewInterface recyclerViewInterface){
        this.pizzas = pizzas;
        this.recyclerViewInterface=recyclerViewInterface;
    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_righa,parent,false);

        return new ProjectViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
    holder.bind(pizzas[position]);



    }

    @Override
    public int getItemCount(){
        return pizzas.length;
    }


    @Override
    public void OnItemClick(int position) {

    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        private final TextView nome;
        private final ImageView icon;
        private final TextView desc;

        public ProjectViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            nome = itemView.findViewById(R.id.text_card);
            icon = itemView.findViewById(R.id.image_icon_card);
            desc= itemView.findViewById(R.id.text_desc);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recyclerViewInterface !=null) {
                        int pos= getAdapterPosition();
                        if(pos !=RecyclerView.NO_POSITION){
                           recyclerViewInterface.OnItemClick(pos);
                        }
                    }
                }
            });
        }

        public void bind(Pizza pizza) {
            nome.setText(pizza.getName());
            icon.setImageResource(pizza.getImage());
            desc.setText(pizza.getDescrizione());
        }
    }
}

package com.example.spontiniMenu.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spontiniMenu.R;

public class DettaglioAdapter extends RecyclerView.Adapter<DettaglioAdapter.ProjectViewHolder>{
    private final String[] piatti;

    public DettaglioAdapter(String[] piatti){
        this.piatti=piatti;

    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingrediente_pizza,parent,false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
            String item= piatti[position];
            holder.bind(item);
    }

    @Override
    public int getItemCount(){
        return piatti.length;
    }


     class ProjectViewHolder extends RecyclerView.ViewHolder {

        private final TextView nome;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.text_card);
        }

        public void bind(String item) {
                nome.setText(item);

        }
    }
}

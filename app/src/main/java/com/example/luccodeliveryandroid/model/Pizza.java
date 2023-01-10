package com.example.luccodeliveryandroid.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Pizza implements Serializable {
    String name;
    String descrizione;
    int image;
    ArrayList<String> piatti;


    public ArrayList<String> getPiatti(int pos) {
        return piatti;
    }

    public void setPiatti(ArrayList<String> piatti) {
        this.piatti = piatti;
    }

    public Pizza(String name, int image, String descrizione, ArrayList<String> piatti) {
        this.name = name;
        this.image = image;
        this.descrizione = descrizione;
        this.piatti=piatti;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", image=" + image +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public ArrayList<String> getPiattiArray() {
        return piatti;
    }
}


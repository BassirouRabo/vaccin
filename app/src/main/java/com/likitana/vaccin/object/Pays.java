package com.likitana.vaccin.object;

import java.io.Serializable;

public class Pays implements Serializable {
    private String nom;

    public Pays(String nom) {
        this.nom = nom;
    }

    public Pays() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

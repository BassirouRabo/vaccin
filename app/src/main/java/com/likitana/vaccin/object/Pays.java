package com.likitana.vaccin.object;

import java.io.Serializable;

public class Pays implements Serializable {
    private String nom;
    private String page;

    public Pays(String nom) {
        this.nom = nom;
    }

    public Pays(String nom, String page) {
        this.nom = nom;
        this.page = page;
    }

    public Pays() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}

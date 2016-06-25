package com.likitana.vaccin.object;


public class Home {
    private String nom;
    private Integer icon;

    public Home(String nom, Integer icon) {
        this.nom = nom;
        this.icon = icon;
    }

    public Home() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }
}

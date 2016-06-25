package com.likitana.vaccin.object;

import java.io.Serializable;

public class Abbreviation implements Serializable {
    private Integer id;
    private String abbreviation;
    private String nom;

    public Abbreviation(Integer id, String abbreviation, String nom) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.nom = nom;
    }

    public Abbreviation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

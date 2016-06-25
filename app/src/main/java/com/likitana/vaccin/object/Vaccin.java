package com.likitana.vaccin.object;

import java.io.Serializable;

public class Vaccin implements Serializable {
    private Integer id;
    private String nom;
    private String nomCommercial;
    private String abbreviation;
    private String presentation;
    private String indication;
    private String contreIndication;
    private String effetSecondaire;

    public Vaccin(Integer id, String nom, String nomCommercial, String abbreviation, String presentation, String indication, String contreIndication, String effetSecondaire) {
        this.id = id;
        this.nom = nom;
        this.nomCommercial = nomCommercial;
        this.abbreviation = abbreviation;
        this.presentation = presentation;
        this.indication = indication;
        this.contreIndication = contreIndication;
        this.effetSecondaire = effetSecondaire;
    }

    public Vaccin(String nom) {
        this.nom = nom;
    }

    public Vaccin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getContreIndication() {
        return contreIndication;
    }

    public void setContreIndication(String contreIndication) {
        this.contreIndication = contreIndication;
    }

    public String getEffetSecondaire() {
        return effetSecondaire;
    }

    public void setEffetSecondaire(String effetSecondaire) {
        this.effetSecondaire = effetSecondaire;
    }
}

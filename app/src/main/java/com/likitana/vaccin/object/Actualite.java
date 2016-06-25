package com.likitana.vaccin.object;

import java.io.Serializable;

public class Actualite implements Serializable {
    private Integer id;
    private String jour;
    private String titre;
    private String introduction;
    private String actualite;

    public Actualite(Integer id, String jour, String titre, String introduction, String actualite) {
        this.id = id;
        this.jour = jour;
        this.titre = titre;
        this.introduction = introduction;
        this.actualite = actualite;
    }

    public Actualite() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getActualite() {
        return actualite;
    }

    public void setActualite(String actualite) {
        this.actualite = actualite;
    }
}


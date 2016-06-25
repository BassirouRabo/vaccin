package com.likitana.vaccin.object;

import java.io.Serializable;


public class Calendrier implements Serializable {
    private Integer id;
    private String periode;

    public Calendrier(Integer id, String periode) {
        this.id = id;
        this.periode = periode;
    }

    public Calendrier() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }
}

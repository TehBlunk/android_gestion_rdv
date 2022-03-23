package com.example.gestion_rdv;

import java.time.LocalDate;
import java.time.LocalTime;

public class Indisponibilite {
    private int id;
    private Motif unMot;
    private Medecin unMed;
    private LocalDate date;
    private LocalTime heure_deb;
    private LocalTime heure_fin;

    public Indisponibilite(int id, Motif unMot, Medecin unMed, LocalDate date, LocalTime heure_deb, LocalTime heure_fin) {
        this.id = id;
        this.unMot = unMot;
        this.unMed = unMed;
        this.date = date;
        this.heure_deb = heure_deb;
        this.heure_fin = heure_fin;
    }

    @Override
    public String toString() {
        return "Indisponibilite{" +
                "id=" + id +
                ", unMot=" + unMot +
                ", unMed=" + unMed +
                ", date=" + date +
                ", heure_deb=" + heure_deb +
                ", heure_fin=" + heure_fin +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Motif getUnMot() {
        return unMot;
    }

    public void setUnMot(Motif unMot) {
        this.unMot = unMot;
    }

    public Medecin getUnMed() {
        return unMed;
    }

    public void setUnMed(Medecin unMed) {
        this.unMed = unMed;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure_deb() {
        return heure_deb;
    }

    public void setHeure_deb(LocalTime heure_deb) {
        this.heure_deb = heure_deb;
    }

    public LocalTime getHeure_fin() {
        return heure_fin;
    }

    public void setHeure_fin(LocalTime heure_fin) {
        this.heure_fin = heure_fin;
    }
}

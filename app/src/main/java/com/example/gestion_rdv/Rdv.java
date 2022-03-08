package com.example.gestion_rdv;

import java.time.LocalDate;
import java.time.LocalTime;

public class Rdv {
    private int id;
    private Patient unPat;
    private Medecin unMed;
    private Assistant unAss;
    private LocalDate date;
    private LocalTime heure_deb;
    private LocalTime heure_fin;
    private String libelle;

    public Rdv(int id, Patient unPat, Medecin unMed, Assistant unAss, LocalDate date, LocalTime heure_deb, LocalTime heure_fin, String libelle) {
        this.id = id;
        this.unPat = unPat;
        this.unMed = unMed;
        this.unAss = unAss;
        this.date = date;
        this.heure_deb = heure_deb;
        this.heure_fin = heure_fin;
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Rdv{" +
                "id=" + id +
                ", unPat=" + unPat +
                ", unMed=" + unMed +
                ", unAss=" + unAss +
                ", date=" + date +
                ", heure_deb=" + heure_deb +
                ", heure_fin=" + heure_fin +
                ", libelle='" + libelle + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getUnPat() {
        return unPat;
    }

    public void setUnPat(Patient unPat) {
        this.unPat = unPat;
    }

    public Medecin getUnMed() {
        return unMed;
    }

    public void setUnMed(Medecin unMed) {
        this.unMed = unMed;
    }

    public Assistant getUnAss() {
        return unAss;
    }

    public void setUnAss(Assistant unAss) {
        this.unAss = unAss;
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

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

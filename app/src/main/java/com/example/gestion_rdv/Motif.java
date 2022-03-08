package com.example.gestion_rdv;

public class Motif {
    private int id;
    private String libelle;

    public Motif(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Motif{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}

package com.example.gestion_rdv;

import org.json.JSONArray;

public class Utilisateur {
    private int id;
    private Patient unPat;
    private Medecin unMed;
    private Assistant unAss;
    private String email;
    private JSONArray roles;
    private String password;

    public Utilisateur(int id, Patient unPat, Medecin unMed, Assistant unAss, String email, JSONArray roles, String password) {
        this.id = id;
        this.unPat = unPat;
        this.unMed = unMed;
        this.unAss = unAss;
        this.email = email;
        this.roles = roles;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JSONArray getRoles() {
        return roles;
    }

    public void setRoles(JSONArray roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", unPat=" + unPat +
                ", unMed=" + unMed +
                ", unAss=" + unAss +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                ", password='" + password + '\'' +
                '}';
    }
}

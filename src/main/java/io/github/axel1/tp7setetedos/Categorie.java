package io.github.axel1.tp7setetedos;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int code;
    private String libelle;
    private List<Jouet> lesJouets = new ArrayList<Jouet>();

    public Categorie(int code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public void add(Jouet jouet) {
        this.lesJouets.add(jouet);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Jouet> getLesJouets() {
        return lesJouets;
    }

    public void setLesJouets(List<Jouet> lesJouets) {
        this.lesJouets = lesJouets;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "code=" + code +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}

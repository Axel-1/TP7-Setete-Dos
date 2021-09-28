package io.github.axel1.tp7setetedos;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
    private String annee;
    private Map<Jouet, Integer> lesJouets = new HashMap<Jouet, Integer>();

    public Catalogue(String annee, Map<Jouet, Integer> lesJouets) {
        this.annee = annee;
        this.lesJouets = lesJouets;
    }

    public Map<Categorie, Integer> statCateg() {
        Map<Categorie, Integer> stat = new HashMap<Categorie, Integer>();
        for (Map.Entry<Jouet, Integer> entry : this.lesJouets.entrySet()) {
            if (stat.containsKey(entry.getKey().getCateg())) {
                stat.put(entry.getKey().getCateg(), stat.get(entry.getKey().getCateg()) + entry.getValue());
            } else {
                stat.put(entry.getKey().getCateg(), entry.getValue());
            }
        }

        return stat;
    }

    public int quantiteDistribuee() {
        int total = 0;

        for (Map.Entry<Jouet, Integer> entry : this.lesJouets.entrySet()) {
            total += entry.getValue();
        }

        return total;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Map<Jouet, Integer> getLesJouets() {
        return lesJouets;
    }

    public void setLesJouets(Map<Jouet, Integer> lesJouets) {
        this.lesJouets = lesJouets;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "annee='" + annee + '\'' +
                ", lesJouets=" + lesJouets +
                '}';
    }
}

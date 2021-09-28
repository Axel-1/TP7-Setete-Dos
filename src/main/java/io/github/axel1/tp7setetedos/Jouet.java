package io.github.axel1.tp7setetedos;

public class Jouet {
    private int numero;
    private String libelle;
    private Categorie categ;
    private TrancheAge tranche;

    public Jouet(int numero, String libelle, Categorie categ, TrancheAge tranche) {
        this.numero = numero;
        this.libelle = libelle;
        this.categ = categ;
        this.categ.add(this);
        this.tranche = tranche;
    }

    public boolean convient(int unAge) {
        if (unAge >= tranche.getAgeMin() & unAge <= tranche.getAgeMax()) {
            return true;
        } else {
            return false;
        }
    }

    public String getInfos() {
        return this.libelle + ";" + this.categ + ";" + this.tranche.getAgeMin() + ";" + this.tranche.getAgeMax();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Categorie getCateg() {
        return categ;
    }

    public void setCateg(Categorie categ) {
        this.categ = categ;
    }

    public TrancheAge getTranche() {
        return tranche;
    }

    public void setTranche(TrancheAge tranche) {
        this.tranche = tranche;
    }

    @Override
    public String toString() {
        return "Jouet{" +
                "numero=" + numero +
                ", libelle='" + libelle + '\'' +
                ", categ=" + categ +
                ", tranche=" + tranche +
                '}';
    }
}

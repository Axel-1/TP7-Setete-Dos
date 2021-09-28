package io.github.axel1.tp7setetedos;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Categorie categorie1 = new Categorie(1, "Puzzle");
        Categorie categorie2 = new Categorie(2, "Jeux de société");
        Categorie categorie3 = new Categorie(3, "Livre");

        TrancheAge trancheAge1 = new TrancheAge(1, 3, 99);
        TrancheAge trancheAge2 = new TrancheAge(1, 3, 99);

        Jouet jouet1 = new Jouet(1, "Test", categorie1, trancheAge1);
        Jouet jouet2 = new Jouet(2, "Test", categorie1, trancheAge1);
        Jouet jouet3 = new Jouet(3, "Test", categorie1, trancheAge2);
        Jouet jouet4 = new Jouet(4, "Test", categorie2, trancheAge1);
        Jouet jouet5 = new Jouet(5, "Test", categorie2, trancheAge2);
        Jouet jouet6 = new Jouet(6, "Test", categorie3, trancheAge2);
        Jouet jouet7 = new Jouet(7, "Test", categorie3, trancheAge1);
        Jouet jouet8 = new Jouet(8, "Test", categorie3, trancheAge1);

        Map<Jouet, Integer> jouets = new HashMap<Jouet, Integer>();

        jouets.put(jouet1, 30);
        jouets.put(jouet2, 16);
        jouets.put(jouet3, 2);
        jouets.put(jouet4, 9);
        jouets.put(jouet5, 3);
        jouets.put(jouet6, 43);
        jouets.put(jouet7, 5);
        jouets.put(jouet8, 90);

        Catalogue catalogue = new Catalogue("2021", jouets);

        System.out.println(catalogue);
        System.out.println(catalogue.statCateg());
    }
}

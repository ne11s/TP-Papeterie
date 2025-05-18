package org.example.Classes;

import java.util.List;

public class Facture {
    private int numfacture;
    private static int nbrFacture;
    private String client;
    private String date;
    private double total;
    private List<Ligne> lignes;

    public Facture(String client, String date) {
        this.client = client;
        this.date = date;
        this.numfacture = ++nbrFacture;
    }
    public void ajouterligne(String ref, int quantite){
        Ligne ligneAAjouter= new Ligne(ref,quantite);
        lignes.add(ligneAAjouter);
    }
    public double getPrixTotal() {
        return this.total;
    }

}

package org.example.Classes;

public class Facture {
    private int numfacture;
    private static int nbrFacture;
    private String client;
    private String date;
    private double total;

    public Facture(String client, String date) {
        this.client = client;
        this.date = date;
        this.numfacture = ++nbrFacture;
    }
    public void ajouterligne(){

    }
}

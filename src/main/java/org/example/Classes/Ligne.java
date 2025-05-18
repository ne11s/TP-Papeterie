package org.example.Classes;

public class Ligne {
    private ArticleUnitaire article;
    private int quantite;
    private double remis;

    public Ligne(String ref, int quantite) {
        this.article = ;
        this.quantite = quantite;

    }


    public String afficherLigne() {
        return this.quantite+'-'+
                article.getRef()+'-'+
                article.getNom()+'-'+
                article.getPrix()+'-'+
                article.getPrix()*quantite;
    }
}

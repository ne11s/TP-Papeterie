package org.example.Classes;

public class Ligne {
    private Article article;
    private int quantite;
    private double remis;

    public Ligne(String ref, int quantite) {
        this.article = Articles.getArticleParRef(ref);
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

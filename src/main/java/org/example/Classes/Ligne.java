package org.example.Classes;

public class Ligne {
    private ArticleUnitaire article;
    private int quantite;

    public Ligne(ArticleUnitaire article, int quantite) {
        this.article = article;
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

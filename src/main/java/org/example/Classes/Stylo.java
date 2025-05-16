package org.example.Classes;

public class Stylo extends ArticleUnitaire {
    private String couleur;

    public Stylo(String nom, double prix, String couleur) {
        super(nom, prix);
        this.couleur= couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Stylo "+ super.getNom()+" de couleur "+ this.couleur+" au prix de : "+super.getPrix();
    }
}

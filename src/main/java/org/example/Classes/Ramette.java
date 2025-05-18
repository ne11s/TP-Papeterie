package org.example.Classes;

public class Ramette extends ArticleUnitaire {
    private String gramage;

    public Ramette(String nom, double prix, String gramage,String ref) {
        super(nom, prix, ref);
        this.gramage = gramage;
    }
    public String getCouleur() {
        return gramage;
    }

    public void setGramage(String gramage) {
        this.gramage = gramage;
    }

    @Override
    public String toString() {
        return "Ramette "+ super.getNom()+" de gramage "+ this.gramage+" au prix de : "+super.getPrix();
    }
}

package org.example.Classes;

public abstract class Article {

    private String ref;

    public Article(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return this.ref;
    }

    public String getNom(){
        return "";
    }

    public double getPrix(){
        return 1;
    }

}

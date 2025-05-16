package org.example.Classes;

public class Article {
    private static int nbrArticle;
    private int ref;


    public Article() {
        this.ref = ++nbrArticle;
    }

    public int getRef() {
        return this.ref;
    }


    public static int getNbrArticle() {
        return nbrArticle;
    }

}

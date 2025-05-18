package org.example.Classes;

import java.util.HashMap;

public class Articles {
    private static HashMap<String, Article> articles= new HashMap<>();

    public static void ajoutArticle(Article article) {
        articles.put(article.getRef(), article);
    }
    public static Article getArticleParRef(String ref) {
        return articles.get(ref);
    }
}

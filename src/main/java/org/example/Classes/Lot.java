package org.example.Classes;

public class Lot extends Article{
    private ArticleUnitaire article;
    private int quantite;
    private int remise;

    public Lot( ArticleUnitaire article, int quantite, int remise) {
        super();
        this.article = article;
        this.quantite = quantite;
        this.remise = remise;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(ArticleUnitaire article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "article=" + article +
                ", quantite=" + quantite +
                ", remise=" + remise +
                "%, prix="+ article.getPrix()*remise/100+
                "€}";
    }
}

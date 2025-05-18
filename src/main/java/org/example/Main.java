package org.example;

import org.example.Classes.Lot;
import org.example.Classes.Stylo;

public class Main {
    public static void main(String[] args) {

        Stylo styloBicBleu = new Stylo("Bic",1,"bleu","SBB01");
        Lot lotDeStyloBicBleu = new Lot(styloBicBleu,100,10, "LSBB01");
        System.out.println(lotDeStyloBicBleu);

    }
}
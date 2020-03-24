package com.example.pain_composite;

public class PreparationDeCuisine {
    //Classe preparation de cuisine

    //Attributs
    private String libelle;
    private double prix;

    //constructeur
    public PreparationDeCuisine(String libelle, double prix) {
        super();
        this.libelle = libelle;
        this.prix = prix;
    }

    //getter
    public String getLibelle() {
        return libelle;
    }

    //ce getter va se retrouver dans chaque classe fille
    public double getPrix() {
        return prix;
    }

    //COmposition
    public boolean jeSuisCompose()
    {
        return false;
    }

}


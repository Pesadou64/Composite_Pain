package com.example.pain_composite;

public class PreparationSimple extends PreparationDeCuisine{
    //Classe qui hérite de la classe Preparation de cuisine

    //Constructeur via l'héritage de la classe PreparationDeCuisine
    public PreparationSimple(String libelle, double prix) {
        super(libelle, prix);
        // TODO Auto-generated constructor stub
    }

    //getter ou operation dans le cours, renvoi le prix de la preparationSimple
    public double getPrix() {
        double prix = super.getPrix(); //ici on utilise le get prix de la classe preparationDeCUisine via le super.méthodeDeLaClasseHéritée (redéfinition)
        return prix;
    }

}

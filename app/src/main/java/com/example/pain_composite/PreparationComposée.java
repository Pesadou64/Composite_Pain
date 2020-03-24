package com.example.pain_composite;

import java.util.ArrayList;
import java.util.List;

public class PreparationComposée extends PreparationDeCuisine {

    //Attribut supplémentaire permettant d'enregistrer les ingrédients de la préparation
    private List<PreparationDeCuisine> mesEnfants;

    public PreparationComposée(String libelle, double prix) {
        super(libelle, prix); // on prend le constructeur de base de la classe héritée
        this.mesEnfants = new ArrayList<PreparationDeCuisine>(); // et on redéfinie en rajoutant l'attribut en plus de cette classe (la list)
        // TODO Auto-generated constructor stub
    }


    public List<PreparationDeCuisine> getMesEnfants() {
        return mesEnfants;
    }



    //getter ou operation dans le cours, elle va afficher le prix de toute sa composition, elle fait la somme de chaque ingrédients de la liste
    public double getPrix() {
        double prix = super.getPrix();

        for (int i = 0; i < mesEnfants.size(); i++) { // i élément de parcours
            prix += mesEnfants.get(i).getPrix(); //ici on fait la somme de chaque ingrédient de la préparation
        }
        return prix;
    }

    //Méthode permettant d'afficher le nom des ingrédients qui compose notre plat
    public void AfficherCompoDuPlat() {
        System.out.println("Liste de la composition du plat "+getLibelle()+" sont :");
        for(int i =0;i<mesEnfants.size();i++) {
            System.out.println(mesEnfants.get(i).getLibelle());
        }
    }


    //ajouter pour la liste
    public void ajouterComposant(PreparationDeCuisine unComposant){
        mesEnfants.add(unComposant);
    }

    //supprimer pour la liste
    public void supprimerComposant(PreparationDeCuisine unComposant) {
        mesEnfants.remove(unComposant);
    }

    //COmposition
    public boolean jeSuisCompose()
    {
        return false;
    }

}

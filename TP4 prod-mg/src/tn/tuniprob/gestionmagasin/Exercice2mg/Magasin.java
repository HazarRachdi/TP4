package tn.tuniprob.gestionmagasin.Exercice2mg;

public class Magasin {
    public int identifiant;
    public String adresse;
    public int capacite=50;
    public  int nbr_produit=0;

    public static int nombre_mg;
    public int num=nombre_mg;

    public Produit[] produit=new Produit[capacite];

    public Magasin() {
        nombre_mg++;
    }

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        nombre_mg++;
    }
    public void ajouter(Produit P){
        if(nbr_produit<=capacite){
            produit[nbr_produit]=P;
        }
        else{
            System.out.println("Desolé,la quantité est maximale");
        }
    }
    public void Affch_mg(){
        System.out.println("l'identifiant:"+identifiant+"\nl'adressse:"+adresse+"\nla capacité:"+capacite);
        System.out.println("l'ensemble des produits du magasin est");
        int i;
        for(i=0;i<=nbr_produit;i++){
            System.out.println("Nom:"+produit[i].getLibellé()+"\nPrix:"+produit[i].getPrix());
        }
    }

    }

package Labo2;

import java.util.*;
import java.lang.Object;
public class Auteur {

    private String nom;
    private String prenom;
    private int date;
    private String langue;

    //Constructeur


    public Auteur(String nom, String prenom, int date, String langue) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.langue = langue;
    }


    //Initialisation

   /* public void init(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Entrer le nom d'auteur");
        nom=sc.next();

        System.out.println("Entrer le prenom de l'auteur ");
        prenom=sc.next();

        System.out.println("Entrer la date de naissance");
        date=sc.nextInt();

        System.out.println("Entrer la langue");
        langue=sc.next();

    }*/
    //Getters

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getDate() { return date; }
    public String getLangue() { return langue; }

    //Setters

    public void setLangue(String langue) { this.langue = langue; }

    @Override
    public String toString(){

        return "Nom: "+nom+"\nPrenom: "+prenom+"\ndate: "+date+"\nLangue: "+langue;
    }
//equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auteur auteur = (Auteur) o;

        if (nom != null ? !nom.equals(auteur.nom) : auteur.nom != null) return false;
        return prenom != null ? prenom.equals(auteur.prenom) : auteur.prenom == null;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        return result;
    }
}

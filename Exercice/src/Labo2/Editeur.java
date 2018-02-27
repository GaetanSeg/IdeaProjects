package Labo2;
import java.util.*;

public class Editeur {

        private String nom;
        private String adresse;
        private String telephone;

//contructeurs


    public Editeur(String nom, String adresse, String telephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

   /* public void init(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Entrer le nom de l'editeur");
        nom=sc.nextLine();

        System.out.println("entrer l'adresse de l'editeur");
        adresse=sc.nextLine();

        System.out.println("entrer le numero de telephone de l'editeur ");
        telephone=sc.next();
    }*/

//getters


    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public String getTelephone() { return telephone; }

//Setters


    public void setAdresse(String adresse) { this.adresse = adresse; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    @Override
    public String toString(){

        return "Nom:"+nom+"\nAdresse:"+adresse+"\nTelepone: "+telephone;
    }
//equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Editeur editeur = (Editeur) o;

        return nom != null ? nom.equals(editeur.nom) : editeur.nom == null;
    }

    @Override
    public int hashCode() {
        return nom != null ? nom.hashCode() : 0;
    }
}

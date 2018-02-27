package Labo3;




public class Auteur {

    private String nom;
    private String prenom;
    private int annee;
    private String langue;

    public Auteur() {
        this.nom = "";
        this.prenom = "";
        this.annee = 0;
        this.langue = "";
    }

    public Auteur(String nom, String prenom, int annee, String langue) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
        this.langue = langue;
    }

    public int getAnnee() {
        return annee;
    }

    public String getLangue() {
        return langue;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String toString() {
        return "nom:" + nom + "\nprenom:" + prenom + "\nannee de naissance:" + annee + "\nlangue :" + langue;
    }

    public boolean equals(Object unObjet) {
        if (unObjet == null) {
            return false;
        }
        if (!(unObjet instanceof Auteur)) {
            return false;
        }
        Auteur autre = (Auteur) unObjet;
        if (this.nom.equals(autre.nom) && this.prenom.equals(autre.prenom) && this.annee == autre.annee) {
            return true;
        } else {
            return false;
        }
    }

}

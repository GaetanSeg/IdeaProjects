package labo3nonmvc;

import labo2.*;

public class Editeur {

    private String nom;
    private String adresse;
    private String tel;

    public Editeur() {
        this.nom = "";
        this.adresse = "";
        this.tel = "";
    }

    public Editeur(String nom, String adresse, String tel) {
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return "nom :" + nom + "\nadresse :" + adresse + "\nTel:" + tel;
    }

    public boolean equals(Object unObjet) {
        if (unObjet == null) {
            return false;
        }
        if (!(unObjet instanceof Editeur)) {
            return false;
        }
        Editeur autre = (Editeur) unObjet;
        if (this.nom.equals(autre.nom) && this.adresse.equals(autre.adresse)) {
            return true;
        } else {
            return false;
        }
    }

}

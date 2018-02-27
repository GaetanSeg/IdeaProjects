package labo3;

import java.util.Objects;



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
    @Override
    public String toString() {
        return "nom:" + nom + " - prenom:" + prenom + " - annee de naissance:" + annee + " - langue:" + langue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nom);
        hash = 13 * hash + Objects.hashCode(this.prenom);
        hash = 13 * hash + this.annee;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auteur other = (Auteur) obj;
        if (this.annee != other.annee) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return true;
    }

    
   

}

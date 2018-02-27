/**
 * @author Michel Poriaux
 * @version 1.0 (2011)
 * @see Livre
 * @see Bibliotheque
 */


public class Auteur {
 private String  nom;
 private String prenom;
 private int annee;
 private String langue;

  public Auteur(){
      this.nom="";
      this.prenom="";
      this.annee=0;
      this.langue="";
  }

  public Auteur(String nom,String prenom,int annee,String langue){
      this.nom=nom;
      this.prenom=prenom;
      this.annee=annee;
      this.langue=langue;
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
    public String toString(){
        return "nom:"+nom+"\nprenom:"+prenom+"\nannee de naissance:"+annee+"\nlangue :"+langue;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auteur other = (Auteur) obj;
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.prenom == null) ? (other.prenom != null) : !this.prenom.equals(other.prenom)) {
            return false;
        }
        if (this.annee != other.annee) {
            return false;
        }
        return true;
    }
 

}

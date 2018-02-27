public class Editeur {
 private String nom;
 private String adresse;
 private String tel;

 public Editeur(){
     this.nom="";
     this.adresse="";
     this.tel="";
   }

 public Editeur(String nom,String adresse,String tel){
     this.nom=nom;
     this.adresse=adresse;
     this.tel=tel;
 }
 

   public String getNom(){
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

    @Override
    public String toString(){
        return "nom :"+nom+"\nadresse :"+adresse+"\nTel:"+tel;
    }
 

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Editeur other = (Editeur) obj;
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.adresse == null) ? (other.adresse != null) : !this.adresse.equals(other.adresse)) {
            return false;
        }
        return true;
    }

   

}

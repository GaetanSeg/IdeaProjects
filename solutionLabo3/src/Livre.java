public class Livre implements Comparable {
 private String titre;
 private String isbn;
 private double prix;
 private Editeur editeurLivre;
 private Auteur auteurLivre;
 
 public Livre(){
     this.titre="";
     this.isbn="";
     this.prix=0;
     editeurLivre=new Editeur();
     auteurLivre=new Auteur();
 }

    public Livre(String titre, String isbn, double prix, Editeur editeurLivre, Auteur auteurLivre) {
        this.titre = titre;
        this.isbn = isbn;
        this.prix = prix;
        this.editeurLivre = editeurLivre;
        this.auteurLivre = auteurLivre;
    }

     public Livre(String titre, String isbn, double prix) {
        this.titre = titre;
        this.isbn = isbn;
        this.prix = prix;
        this.editeurLivre = new Editeur();
        this.auteurLivre = new Auteur();
    }
 
 public Livre(String titre){
     this.titre=titre;
 }



    public Auteur getAuteurLivre() {
        return auteurLivre;
    }

    public Editeur getEditeurLivre() {
        return editeurLivre;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrix() {
        return prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setAuteurLivre(Auteur auteurLivre) {
        this.auteurLivre = auteurLivre;
    }

    public void setEditeurLivre(Editeur editeurLivre) {
        this.editeurLivre = editeurLivre;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    @Override
    public String toString(){
        return "titre :"+titre+"\nisbn:"+isbn+"\nprix:"+prix+"\nEditeur:\n"+editeurLivre+"\nAuteur:\n"+auteurLivre+"\n";
    }
   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livre other = (Livre) obj;
        if ((this.isbn == null) ? (other.isbn != null) : !this.isbn.equals(other.isbn)) {
            return false;
        }
        return true;
    }
   @Override
   public int compareTo(Object o){
      Livre l=(Livre) o;
      return this.isbn.compareTo(l.isbn);
   }


}

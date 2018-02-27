package labo2Suite;

import java.util.*;
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

 public void init(){
     Scanner sc=new Scanner(System.in);
     System.out.print("titre du livre :");
     titre=sc.nextLine();
     System.out.print("isbn :");
     isbn=sc.next();
     System.out.print("prix :");
     prix=sc.nextDouble();
     sc.skip("\n");
     System.out.println("infos editeur :");
     editeurLivre.init();
     System.out.println("infos auteur : ");
     auteurLivre.init();
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

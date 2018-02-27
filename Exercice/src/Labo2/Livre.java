package Labo2;

import java.util.Scanner;

public class Livre {


    private String titre;
    private String isbn;
    private  float prix;
    private Editeur editeurLivre;
    private Auteur auteurLivre;

//constructeur

    public Livre(String titre, String isbn, float prix, Editeur editeurLivre, Auteur auteurLivre) {
        this.titre = titre;
        this.isbn = isbn;
        this.prix = prix;
        this.editeurLivre = editeurLivre;
        this.auteurLivre = auteurLivre;
    }


//initialisation

   /* public void init(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer le Titre d'un livre ");
        titre=sc.nextLine();

        System.out.println("entre l'isbn du livre");
        isbn= sc.nextLine();

        System.out.println("entrer le prix du livre ");
        prix=sc.nextFloat();
        sc.skip("\n");


        editeurLivre.init();
        System.out.println("editeur créé");

        auteurLivre.init();
        System.out.println("Auteur créé");

    }*/

//getters
    public String getTitre() { return titre;}
    public String getIsbn() { return isbn; }
    public float getPrix() { return prix; }
    public Editeur getEditeurLivre() { return editeurLivre; }
    public Auteur getAuteurLivre() { return auteurLivre;
    }

    //setters
    public void setPrix(float prix) { this.prix = prix; }
    public void setEditeurLivre(Editeur editeurLivre) { this.editeurLivre = editeurLivre; }
    public void setAuteurLivre(Auteur auteurLivre) { this.auteurLivre = auteurLivre; }

//equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livre livre = (Livre) o;

        return isbn != null ? isbn.equals(livre.isbn) : livre.isbn == null;
    }

    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", isbn='" + isbn + '\'' +
                ", prix=" + prix +
                ", editeurLivre=" + editeurLivre +
                ", auteurLivre=" + auteurLivre +
                '}';
    }
}



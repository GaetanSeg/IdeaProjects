package Labo3Devoir;


import java.util.Objects;

public class Livre implements Comparable {

    private String titre;
    private String isbn;
    private float prix;
    private Editeur editeurLivre;
    private Auteur auteurLivre;

    public Livre() {

    }

    public Livre(String titre, String isbn, float prix) {
        this.titre = titre;
        this.isbn = isbn;
        this.prix = prix;
        this.editeurLivre = new Editeur("inconnu", "inconnu", "inconnu");
        this.auteurLivre = new Auteur("inconnu", "inconnu", 0, "inconnue");
    }

    public Livre(String titre, String isbn, float prix, Editeur editeurLivre, Auteur auteurLivre) {
        this.titre = titre;
        this.isbn = isbn;
        this.prix = prix;
        this.editeurLivre = editeurLivre;
        this.auteurLivre = auteurLivre;
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

    public float getPrix() {
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
    public String toString() {
        return "titre :" + titre + "\nisbn:" + isbn + "\nprix:" + prix + "\nEditeur:\n" + editeurLivre + "\nAuteur:\n" + auteurLivre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(isbn, livre.isbn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(isbn);
    }

    @Override
    public int compareTo(Object unObjet) {
        Livre autre = (Livre) unObjet;
        return this.isbn.compareTo(autre.isbn);
    }

}

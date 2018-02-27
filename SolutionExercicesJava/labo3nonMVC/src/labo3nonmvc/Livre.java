package labo3nonmvc;

import labo2.*;

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

    public String toString() {
        return "titre :" + titre + "\nisbn:" + isbn + "\nprix:" + prix + "\nEditeur:\n" + editeurLivre + "\nAuteur:\n" + auteurLivre;
    }

    public boolean equals(Object unObjet) {
        if (unObjet == null) {
            return false;
        }
        if (!(unObjet instanceof Livre)) {
            return false;
        }
        Livre autre = (Livre) unObjet;
        if (this.titre.equals(autre.titre)) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Object unObjet) {
        Livre autre = (Livre) unObjet;
        return this.titre.compareTo(autre.titre);
    }

}

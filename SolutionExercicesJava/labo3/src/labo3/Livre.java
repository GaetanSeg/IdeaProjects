package labo3;

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
        return "titre :" + titre + " - isbn:" + isbn + " - prix:" + prix;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.isbn);
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
        final Livre other = (Livre) obj;
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }

  @Override
    public int compareTo(Object unObjet) {
        Livre autre = (Livre) unObjet;
        return this.titre.compareTo(autre.titre);
    }

}

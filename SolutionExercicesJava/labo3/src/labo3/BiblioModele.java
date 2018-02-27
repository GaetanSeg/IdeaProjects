/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

import java.util.*;

public class BiblioModele {

    protected List<Livre> catalogue = new ArrayList<>();
    protected List<Auteur> listeAuteurs = new ArrayList<>();
    protected List<Editeur> listeEditeurs = new ArrayList<>();

    public BiblioModele() {

    }

    public void populate() {
        System.out.println("mode test");
        Auteur a = new Auteur("King", "Stephen", 1945, "anglais");
        listeAuteurs.add(a);
        Editeur e = new Editeur("livre de poche", "Paris", "01234567");
        listeEditeurs.add(e);
        catalogue.add(new Livre("Shining", "12345", 12.50f, e, a));
        catalogue.add(new Livre("Le fléau", "23456", 13.50f, e, a));
        a = new Auteur("Cauvin", "Patrick", 1965, "français");
        listeAuteurs.add(a);
        e = new Editeur("Le masque", "Bruxelles", "0234566");
        listeEditeurs.add(e);
        catalogue.add(new Livre("Les frangins", "343434", 20.5f, e, a));
        e = new Editeur("Editeurs Réunis", "La Louvière", "06434566");
        listeEditeurs.add(e);
        catalogue.add(new Livre("Les frangins", "12444", 15.0f, e, a));
    }

    public boolean ajoutLivre(Livre l) {

        catalogue.add(l);
        return true;
    }

    public boolean ajoutAuteur(Auteur a) {

        listeAuteurs.add(a);
        return true;
    }

    public boolean ajoutEditeur(Editeur e) {

        listeEditeurs.add(e);
        return true;
    }

    public List<Livre> rechTitre(String trech) {
        List<Livre> al = new ArrayList<>();
        for (Livre l : catalogue) {

            if (l.getTitre().equalsIgnoreCase(trech)) {
                al.add(l);
            }

        }
        return al;
    }

    public Livre rechIsbn(String isbnRech) {

        for (Livre l : catalogue) {

            if (l.getIsbn().equalsIgnoreCase(isbnRech)) {
                return l;
            }
        }
        return null;
    }

    public void supprime(Livre l) {
        catalogue.remove(l);
    }

    public List<Auteur> getListeAuteurs() {
        return listeAuteurs;
    }

    public List<Editeur> getListeEditeurs() {
        return listeEditeurs;
    }
}

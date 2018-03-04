package Labo4Mvc;

import java.util.*;

public class BibliothequeModele {

    protected HashMap<String,Livre> catalogue = new HashMap<>();
    protected HashMap<String,Auteur> listeAuteurs = new HashMap<>();
    protected HashMap<String,Editeur> listeEditeurs = new HashMap<>();

    public BibliothequeModele() {

    }

    public void populate() {
        System.out.println("mode test");
        Auteur a = new Auteur("King", "Stephen", 1945, "anglais");
        listeAuteurs.put(a.getNom()+a.getPrenom()+a.getAnnee(),a);
        Editeur e = new Editeur("livre de poche", "Paris", "01234567");
        listeEditeurs.put(e.getNom()+e.getAdresse(),e);
        Livre l =new Livre("Shining", "12345", 12.50f, e, a);
        catalogue.put(l.getIsbn(),l);
        l = new Livre("Le fléau", "23456", 13.50f, e, a);
        catalogue.put(l.getIsbn(),l);
        a = new Auteur("Cauvin", "Patrick", 1965, "français");
        listeAuteurs.put(a.getNom()+a.getPrenom()+a.getAnnee(),a);
        e = new Editeur("Le masque", "Bruxelles", "0234566");
        listeEditeurs.put(e.getNom()+e.getAdresse(),e);
        l = new Livre("Les frangins", "343434", 20.5f, e, a);
        catalogue.put(l.getIsbn(),l);
        e = new Editeur("Editeurs Réunis", "La Louvière", "06434566");
        listeEditeurs.put(e.getNom()+e.getAdresse(),e);
        l = new Livre("Les frangins", "12444", 15.0f, e, a);
        catalogue.put(l.getIsbn(),l);
    }

    public boolean ajoutLivre(Livre l) {

        catalogue.put(l.getIsbn(),l);
        return true;
    }

    public boolean ajoutAuteur(Auteur a) {

        listeAuteurs.put(a.getNom()+a.getPrenom()+a.getAnnee(),a);
        return true;
    }

    public boolean ajoutEditeur(Editeur e) {

        listeEditeurs.put(e.getNom()+e.getAdresse(),e);
        return true;
    }

    public ArrayList<Livre> rechTitre(String trech) {
        ArrayList<Livre> al = new ArrayList<>();

        Collection<Livre> valCat = catalogue.values();

        for (Livre l : valCat) {

            if (l.getTitre().equalsIgnoreCase(trech)) {
                al.add(l);
            }

        }
        return al;
    }

    public Livre rechIsbn(String isbnRech) {
        Collection<Livre> valCat = catalogue.values();
// récuperer toute les valeur de la hashmap
        for (Livre l : valCat) {

            if (l.getIsbn().equalsIgnoreCase(isbnRech)) {
                return l;
            }
        }
        return null;
    }

    public void supprime(Livre l) {
        catalogue.remove(l);
    }

    public HashMap<String,Auteur> getListeAuteurs() {
        return listeAuteurs;
    }

    public HashMap<String,Editeur> getListeEditeurs() {
        return listeEditeurs;
    }
}

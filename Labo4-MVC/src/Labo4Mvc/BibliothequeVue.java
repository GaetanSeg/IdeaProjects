package Labo4Mvc;

import java.util.*;

public class BibliothequeVue {

    private Scanner sc = new Scanner(System.in);

    public BibliothequeVue() {

    }

    public Livre encodeLivre() {
        String isbn = getMsg("isbn :");
        String titre = getMsg("titre du livre :");
        float prix = Float.parseFloat(getMsg("prix :"));
        return new Livre(titre,isbn, prix);
    }

    public Auteur encodeAuteur() {

        String nom = getMsg("nom :");
        String prenom = getMsg("prénom");
        int annee = Integer.parseInt(getMsg("année :"));
        String langue = getMsg("langue:");
        return new Auteur(nom, prenom, annee, langue);
    }

    public Editeur encodeEditeur() {
        String nom = getMsg("nom :");
        String adresse = getMsg("adresse :");
        String tel = getMsg("tel:");
        return new Editeur(nom, adresse, tel);
    }

    public void affLivre(Livre l) {
        affMsg("isbn :" + l.getIsbn());
        affMsg("titre :" + l.getTitre());
        affMsg("prix :" + l.getPrix());
        affAuteur(l.getAuteurLivre());
        affEditeur(l.getEditeurLivre());
    }

    public void affAuteur(Auteur a) {
        affMsg("nom :" + a.getNom());
        affMsg("prénom :" + a.getPrenom());
        affMsg("année  :" + a.getAnnee());
        affMsg("langue :" + a.getLangue());
    }

    public void affEditeur(Editeur e) {
        affMsg("nom :" + e.getNom());
        affMsg("adresse :" + e.getAdresse());
        affMsg("tel :" + e.getTel());

    }

    public Auteur choixListeAuteur(List<Auteur> l) {
        int i = 0;
        for (Auteur a : l) {
            affMsg(++i + "." + a);
        }
        int p = Integer.parseInt(getMsg("position :"));
        //fixme tester p
        return l.get(p - 1);
    }

    public Editeur choixListeEditeur(List<Editeur> l) {
        int i = 0;
        for (Editeur e : l) {
            affMsg(++i + "." + e);
        }
        int p = Integer.parseInt(getMsg("position :"));
        //fixme tester p
        return l.get(p - 1);
    }

    public String getMsg() {
        String msg = sc.nextLine();
        return msg;
    }

    public void affMsg(Object msg) {
        System.out.println(msg);
    }

    public String getMsg(String msg) {//surcharge de la méthode getMsg
        affMsg(msg);
        return getMsg();
    }

}

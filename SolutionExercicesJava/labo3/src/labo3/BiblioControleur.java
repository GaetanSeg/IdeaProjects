/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

import java.util.*;

/**
 *
 * @author Michel
 */
public class BiblioControleur {

    protected BiblioVue bv;
    protected BiblioModele bm;

    public BiblioControleur() {
        this.bv = null;
        this.bm = null;
    }

    public void setBm(BiblioModele bm) {
        this.bm = bm;
    }

    public void setBv(BiblioVue bv) {
        this.bv = bv;
    }

    public void menu() {
        int ch;
        do {
            bv.affMsg("1.ajout livre\n2.ajout auteur\n3.ajout éditeur\n4.recherche titre\n5.recherche isbn\n6.supp livre\n7.fin");
            bv.affMsg("choix :");;
            ch = Integer.parseInt(bv.getMsg());
            switch (ch) {
                case 1:
                    ajoutLivre();
                    break;
                case 2:
                    ajoutAuteur();
                    break;
                case 3:
                    ajoutEditeur();
                    break;
                case 4:
                    rechTitre();
                    break;
                case 5:
                    rechIsbn();
                    break;
                case 6:
                    suppLivre();
                    break;
                case 7:
                    bv.affMsg("bye");
                    break;
                default:
                    bv.affMsg("choix invalide");
            }
        } while (ch != 7);
    }

    public void ajoutLivre() {
        Livre l = bv.encodeLivre();
        Livre l2 = bm.rechIsbn(l.getIsbn());
        if (l2 != null) {
            bv.affMsg("livre déjà encodé avec cet ISBN ");
            bv.affLivre(l2);
            return;
        }
        Auteur a = bv.choixListeAuteur(bm.getListeAuteurs());
        Editeur e = bv.choixListeEditeur(bm.getListeEditeurs());
        l.setAuteurLivre(a);
        l.setEditeurLivre(e);
        bm.ajoutLivre(l);
    }

    public void ajoutAuteur() {
        //todo tester unicité auteur
        Auteur a = bv.encodeAuteur();
        bm.ajoutAuteur(a);
    }

    public void ajoutEditeur() {
        //todo tester unicité auteur
        Editeur el = bv.encodeEditeur();
        bm.ajoutEditeur(el);
    }

    public void rechTitre() {
        ArrayList<Livre> al;
        bv.affMsg("titre recherche :");
        String tr = bv.getMsg();
        al = bm.rechTitre(tr);
        if (!al.isEmpty()) {
            for (Livre l : al) {
                bv.affLivre(l);
            }
        } else {
            bv.affMsg("livre introuvable");
        }

    }

    public void suppLivre() {
        String isbnRech = bv.getMsg("isbn Recherché");
        Livre l = bm.rechIsbn(isbnRech);
        if (l != null) {
            bm.supprime(l);
            bv.affMsg("suppression effectuée");
        } else {
            bv.affMsg("isbn introuvable");
        }
    }

    public void rechIsbn() {
        bv.affMsg("isbn recherche :");
        String isbnRech = bv.getMsg();
        Livre l = bm.rechIsbn(isbnRech);
        if (l != null) {
            bv.affLivre(l);
        } else {
            bv.affMsg("livre introuvable");
        }
    }
}

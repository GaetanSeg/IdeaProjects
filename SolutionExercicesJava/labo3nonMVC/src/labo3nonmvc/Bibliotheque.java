package labo3nonmvc;

import java.util.*;

public class Bibliotheque {

    protected List<Livre> catalogue = new ArrayList<>();
    protected List<Auteur> listeAuteurs = new ArrayList<>();
    protected List<Editeur> listeEditeurs = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public Bibliotheque() {
     }

    public void ajoutLivre() {
        System.out.println("titre du livre");
        String titre = sc.nextLine();
        System.out.println("isbn");
        String isbn = sc.nextLine();
        System.out.println("prix du livre");
        float prix;
        try {
            prix = sc.nextFloat();
            sc.skip("\n");
        } catch (Exception e) {
            System.out.println("prix incorrect");
            prix = 0;
        }
        Livre l = new Livre(titre, isbn, prix);
        catalogue.add(l);
        System.out.println("ajouter auteur ?");
        String rep = sc.nextLine();
        if (rep.equals("oui")) {
            Auteur al;
            int i = 0;

            for (Auteur a : listeAuteurs) {
                i++;
                System.out.println(i + ":" + a);
            }

            System.out.println("dans la liste ?");
            rep = sc.nextLine();
            if (rep.equals("oui")) {
                System.out.println("position:");
                int p = sc.nextInt();
                sc.skip("\n");
                al = listeAuteurs.get(p - 1);
            } else {
                System.out.println("nom :");
                String nom = sc.nextLine();
                System.out.println("prénom :");
                String prenom = sc.nextLine();
                System.out.println("annee :");
                int annee = sc.nextInt();
                sc.skip("\n");
                System.out.println("langue :");
                String langue = sc.nextLine();
                al = new Auteur(nom, prenom, annee, langue);
                listeAuteurs.add(al);
            }
            l.setAuteurLivre(al);
        }

        System.out.println("ajouter éditeur ?");
        rep = sc.nextLine();
        if (rep.equals("oui")) {
            Editeur el;
            int i = 0;
            for (Editeur e : listeEditeurs) {
                i++;
                System.out.println(i + ":" + e);
            }

            System.out.println("dans la liste ?");
            rep = sc.nextLine();
            if (rep.equals("oui")) {
                System.out.println("position:");
                int p = sc.nextInt();
                sc.skip("\n");
                el = listeEditeurs.get(p - 1);
            } else {
                System.out.println("nom :");
                String nom = sc.nextLine();
                System.out.println("adresse :");
                String adresse = sc.nextLine();
                System.out.println("telephone :");
                String tel = sc.nextLine();
                el = new Editeur(nom, adresse, tel);
                listeEditeurs.add(el);
            }

            l.setEditeurLivre(el);
        }
    }

    public void rechTitre() {

        System.out.println("titre recherche");
        String trech = sc.nextLine();
        ArrayList al = new ArrayList();
        for (Livre l : catalogue) {
            if (l.getTitre().equalsIgnoreCase(trech)) {
                System.out.println(l);
            }
        }

    }

    public void rechIsbn() {

        System.out.println("isbn recherche");
        String isbnRech = sc.nextLine();
        for (Livre l : catalogue) {
            if (l.getIsbn().equalsIgnoreCase(isbnRech)) {
                System.out.println(l);
            }
        }

    }

    public void trierCatalogue() {

        Collections.sort(catalogue);
        for (Livre l : catalogue) {
            System.out.println(l);
        }
    }

    public void menu() {
        int ch;
        do {
            System.out.println("1.ajout \n2.recherche titre\n3.recherche isbn\n4.trier catalogue\n5.fin");
            System.out.println("choix :");
            ch = sc.nextInt();
            sc.skip("\n");
            switch (ch) {
                case 1:
                    ajoutLivre();
                    break;
                case 2:
                    rechTitre();
                    break;
                case 3:
                    rechIsbn();
                    break;
                case 4:
                    trierCatalogue();
                    break;
                case 5:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (ch != 5);
    }

    public static void main(String[] args) {
        Bibliotheque maBibliotheque = new Bibliotheque();
        maBibliotheque.menu();
    }
}

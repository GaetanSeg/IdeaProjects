/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2Suite;

import java.util.*;

public class Bibliotheque {

    private Livre[] catalogue;
    private int nLivres = 0;
    private Scanner sc = new Scanner(System.in);

    public Bibliotheque() {

    }

    private void initialisation() {
        int maxl;
        do {
            System.out.print("Nombre de livres max dans le catalogue :");
            maxl = sc.nextInt();
            if (maxl <= 0) {
                System.out.println("nombre incorrect");
            }
        } while (maxl <= 0);
        catalogue = new Livre[maxl];
    }

    private void menu() {
        int ch;
        do {
            System.out.println("1.ajout \n2.recherche titre\n3.recherche isbn\n4.fin");
            System.out.print("choix :");
            ch = sc.nextInt();
            sc.skip("\n");
            Auteur a;
            switch (ch) {
                case 1:
                    ajout();
                    break;
                case 2:
                    rechTitre();
                    break;
                case 3:
                    rechIsbn();
                    break;
                case 4:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (ch != 4);
    }

    private void populate() {
        System.out.println("mode test");
        catalogue = new Livre[10];
        Auteur a = new Auteur("King", "Stephen", 1945, "anglais");
        Editeur e = new Editeur("livre de poche", "Paris", "01234567");
        catalogue[0] = new Livre("Shining", "12345", 12.50, e, a);
        catalogue[1] = new Livre("Le fléau", "23456", 13.50, e, a);
        a = new Auteur("Cauvin", "Patrick", 1965, "français");
        e = new Editeur("Le masque", "Bruxelles", "0234566");
        catalogue[2] = new Livre("Les frangins", "343434", 20.5, e, a);
        e = new Editeur("Editeurs Réunis", "La Louvière", "06434566");
        catalogue[3] = new Livre("Les frangins", "12444", 15.0, e, a);
        nLivres = 4;
    }

    private void ajout() {
        if (nLivres < catalogue.length) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Auteur du livre :");
            System.out.print("nom : ");
            String nomA = sc.nextLine();
            System.out.print("prénom : ");
            String prenomA = sc.nextLine();
            System.out.print("annee de naissance: ");
            int anneeA = sc.nextInt();
            sc.skip("\n");
            System.out.print("langue : ");
            String langueA = sc.nextLine();
            Auteur a = new Auteur(nomA, prenomA, anneeA, langueA);

            System.out.println("Editeur : ");
            System.out.print("nom : ");
            String nomE = sc.nextLine();
            System.out.print("adresse : ");
            String adrE = sc.nextLine();
            System.out.print("tel : ");
            String telE = sc.nextLine();
            Editeur e = new Editeur(nomE, adrE, telE);

            System.out.println("Livre :");
            System.out.print("titre : ");
            String titre = sc.nextLine();
            System.out.print("isbn : ");
            String isbn = sc.nextLine();
            System.out.print("prix : ");
            double prix = sc.nextDouble();
            sc.skip("\n");
            Livre l = new Livre(titre, isbn, prix, e, a);
            catalogue[nLivres] = l;
            nLivres++;
        } else {
            System.out.println("désolé le catalogue est complet");
        }
    }

    private void rechTitre() {

        System.out.print("titre recherché:");
        String trech = sc.nextLine();
        boolean trouve = false;
        for (int i = 0; i < nLivres; i++) {
            Livre l = catalogue[i];
            if (l.getTitre().contains(trech)) {
                System.out.println(l);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("aucun livre trouvé");
        }
    }

    private void rechIsbn() {

        System.out.print("isbn recherché:");
        String irech = sc.nextLine();
        boolean trouve = false;
        for (int i = 0; i < nLivres; i++) {
            Livre l = catalogue[i];
            if (l.getIsbn().equalsIgnoreCase(irech)) {
                System.out.println(l);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("aucun livre trouvé");
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("nombre d'arguments invalide");
            System.exit(1);//code d'erreur si !=0
        }
        Bibliotheque maBibli = new Bibliotheque();
        switch (args[0]) {
            case "test":
                maBibli.populate();
                break;
            case "prod":
                maBibli.initialisation();
                break;
            default:
                System.out.println("mode incorrect");
                System.exit(1);// code d'erreur si !=0
        }
        maBibli.menu();

    }

}

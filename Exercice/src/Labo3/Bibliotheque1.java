
package Labo3;

import java.util.*;

public class Bibliotheque1 {

    private List<Livre> catalogueL = new ArrayList<>();
    private List<Editeur> catalogueE = new ArrayList<>();
    private List<Auteur> catalogueA = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Bibliotheque1() {
    }

    private void menu() {

        int ch;
        do {
            System.out.println("1.ajout \n2.recherche titre\n3.recherche isbn\n4.suppression\n5.Trier le catalogue\n6.fin");
            System.out.print("choix :");
            ch = sc.nextInt();
            sc.skip("\n");
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
                    suppLivre();
                    break;
                case 5:
                    trierCatalogue();
                    break;
                case 6:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (ch != 5);
    }

    private void populate() {

        System.out.println("Vous êtes en mode test");

        //Encodage des auteurs et editeurs
        catalogueA.add(new Auteur("King", "Stephen", 1945, "anglais"));
        catalogueA.add(new Auteur("Cauvin", "Patrick", 1965, "français"));
        catalogueE.add(new Editeur("Le masque", "Bruxelles", "0234566"));
        catalogueE.add(new Editeur("livre de poche", "Paris", "01234567"));
        catalogueE.add(new Editeur("Editeurs Réunis", "La Louvière", "06434566"));

        //Encodage des différents livres.
        catalogueL.add(new Livre("Shining", "12345", 12.50, catalogueE.get(0), catalogueA.get(0)));
        catalogueL.add(new Livre("Le fléau", "23456", 13.50, catalogueE.get(0), catalogueA.get(0)));
        catalogueL.add(new Livre("Les frangins", "343434", 20.5, catalogueE.get(1), catalogueA.get(1)));
        catalogueL.add(new Livre("Les frangins", "12444", 15.0, catalogueE.get(2), catalogueA.get(1)));

    }

    private void listofEditors() {

        //liste des Editeurs
        //test avec une boucle pour voir si le catalogue est vide
        if (catalogueE.isEmpty()) {
            System.out.println("Aucun Editeurs dans la liste ");
        } else {
            System.out.println("voici la liste des éditeurs");
            for (Editeur e : catalogueE) {
                System.out.println(e);
            }

        }

    }

    private void listofAutors() {

        //liste des Auteurs
        if (catalogueA.isEmpty()) {
            System.out.println("Aucun Auteurs dans la liste ");
        } else {
            System.out.println("voici la liste des Auteurs ");
            for (Auteur a : catalogueA) {
                System.out.println(a);
            }
        }
    }

    private int rechEditors() {

        boolean trouve = false;
        int index = -1;
        System.out.println("Recherche de l'editeur - encoder le nom de l'editeur :");
        String rechE = sc.nextLine();

        for (Editeur e : catalogueE) {
            if (e.getNom().toLowerCase().contains(rechE.toLowerCase())) {
                System.out.println("L'editeur : " + e.getNom() + "a été trouvé et selectionné pour l'ajout de votre livre ");
                index = catalogueE.indexOf(e);
                trouve = true;


            } else if (!trouve) System.out.println("editeur introuvable");
        }
        return index;

    }

    private int rechAutors() {

        boolean trouve = false;
        int index = -1;
        System.out.println("Recherche de l'auteurs - encoder le nom de l'auteur :");
        String rechA = sc.nextLine();

        for (Auteur a : catalogueA) {
            if (a.getNom().toLowerCase().contains(rechA.toLowerCase())) {
                System.out.println("L'auteur : " + a.getNom() + " a été trouvé et selectionné pour l'ajout de votre livre ");
                index = catalogueA.indexOf(a);
                trouve = true;


            } else if (!trouve) System.out.println("auteurs introuvable");
        }
        return index;


    }

    private void ajout() {
        String ch;
        System.out.println("isbn");
        String isbn = sc.nextLine();
        Livre l = infosIsbn(isbn);

        if (l != null) {
            System.out.println("livre déjà encodé");
            return;
        }

        System.out.println("titre du livre");
        String titre = sc.nextLine();
        System.out.println("prix du livre");
        float prix;

        try {
            prix = sc.nextFloat();
            sc.skip("\n");
        } catch (Exception e) {
            System.out.println("prix incorrect");
            prix = 0;
        }

        int positionA = 0;
        System.out.println("Encodage de l'auteur ");

        System.out.println("voulez vous voir la liste des Auteurs déja encodé ? oui/non ");
        ch = sc.nextLine();
        if (ch.equalsIgnoreCase("oui")) {
            listofAutors();
            System.out.println("choisir un auteur parmi la liste ? oui/ non");
            ch = sc.nextLine();
            if (ch.equalsIgnoreCase("oui")) {
                positionA = rechAutors();

            } else if (ch.equalsIgnoreCase("non")) {
                System.out.println("Nom de l'auteur :");
                String nom = sc.nextLine();

                System.out.println("prénom de l'auteur :");
                String prenom = sc.nextLine();

                System.out.println("annee :");
                int annee = sc.nextInt();
                sc.skip("\n");

                System.out.println("langue :");
                String langue = sc.nextLine();
                Auteur a = new Auteur(nom, prenom, annee, langue);
                catalogueA.add(a);
                positionA = catalogueA.indexOf(a);

            }
        }

        //
        int positionE = 0;
        System.out.println("Encodage de l'éditeur");

        System.out.println("voulez vous voir la liste des éditeurs déja encodé ? oui / non ");
        ch = sc.nextLine();
        if (ch.equalsIgnoreCase("oui")) {
            listofEditors();
            System.out.println("choisir un editeurs parmi la liste ? oui/ non");
            ch = sc.nextLine();
            if (ch.equalsIgnoreCase("oui")) {
                positionE = rechEditors();
            } else {
                System.out.println("nom  de l'éditeur :");
                String nom = sc.nextLine();

                System.out.println("adresse :");
                String adresse = sc.nextLine();

                System.out.println("telephone :");
                String tel = sc.nextLine();
                Editeur e = new Editeur(nom, adresse, tel);
                catalogueE.add(e);
                positionE = catalogueE.indexOf(e);
            }
        }

        catalogueL.add(new Livre(titre, isbn, prix, catalogueE.get(positionE), catalogueA.get(positionA)));
    }

    public void rechTitre() {

        boolean trouve = false;
        System.out.println("titre recherche");
        String trech = sc.nextLine();

        for (Livre l : catalogueL) {
            if (l.getTitre().toLowerCase().contains(trech.toLowerCase())) {
                System.out.println(l);
                trouve = true;
            }
        }
        if (!trouve) System.out.println("titre introuvable");
    }

    public void rechIsbn() {
        System.out.println("isbn recherche");
        String isbnRech = sc.nextLine();
        Livre l = infosIsbn(isbnRech);
        if (l != null) System.out.println(l);
        else System.out.println("isbn introuvable");
    }

    public void suppLivre() {//utiliser iterators
        System.out.println("isbn recherche");
        String isbnRech = sc.nextLine();
        Livre l = infosIsbn(isbnRech);
        if (l != null) {
            catalogueL.remove(l);
            System.out.println("suppression effectuée");
        } else System.out.println("isbn introuvable");
    }

    public Livre infosIsbn(String isbn) {

        for (Livre l : catalogueL) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }
    public void trierCatalogue(){
        Collections.sort(catalogueL);
        for (Livre l: catalogueL) {
            System.out.println(l);
        }

    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("nombre d'arguments invalide");
            System.exit(1);//code d'erreur si !=0
        }
        Bibliotheque1 maBibli = new Bibliotheque1();
        switch (args[0]) {
            case "test":
                maBibli.populate();
                break;
            case "prod"://rien à faire
                break;
            default:
                System.out.println("mode incorrect");
                System.exit(1);// code d'erreur si !=0
        }
        maBibli.menu();

    }

}

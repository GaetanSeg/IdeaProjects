/*-implanter dans la classe Livre une méthode CompareTo permettant de comparer deux livres sur base de leur isbn(rappel : ajouter lors de la déclaration de la classe Livre : "implements Comparable")

-A l'aide de l'assistant netbeans ,implanter dans la classe Livre une méthode equals et une méthode  hashCode basées sur l'ISBN.

-afficher la liste des livres dans l'ordre inverse de leur insertion (dernier entré premier affiché). Utilisez les fonctionnalités adéquates de la classe Stack.

-afficher tous les livres d'un éditeur dont on indique le nom et l'adresse.
*/
package Labo3Devoir;

import java.util.*;

public class Bibliotheque {

    protected Stack<Livre> catalogue = new Stack<>();
    protected Stack<Auteur> listeAuteurs = new Stack<>();
    protected Stack<Editeur> listeEditeurs = new Stack<>();

    Scanner sc = new Scanner(System.in);

    public Bibliotheque() {
    }

    private void populate() {
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

    public void ajoutLivre() {
        System.out.println("isbn");
        String isbn = sc.nextLine();
        Livre l = infosIsbn(isbn);
        if (l != null) {
            System.out.println("livre déjà encodé\n" + l);
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
        l = new Livre(titre, isbn, prix);
        catalogue.add(l);
        int i = 0;
        for (Auteur a : listeAuteurs) {
            i++;
            System.out.println(i + ":" + a);
        }
        //todo Vérification de la résolution du fixme tester p
        System.out.println("position:");
        int p = 0;
        do {
            p = sc.nextInt();
            sc.skip("\n");
        } while (p < listeAuteurs.size() || p > listeAuteurs.size());

        Auteur al = listeAuteurs.get(p - 1);

        l.setAuteurLivre(al);

        i = 0;

        for (Editeur e : listeEditeurs) {
            i++;
            System.out.println(i + ":" + e);
        }

        System.out.println("position:");
        p = 0;
        do{
            p = sc.nextInt();
            sc.skip("\n");
        } while (p < listeEditeurs.size() || p > listeEditeurs.size());

        Editeur el = listeEditeurs.get(p - 1);
        l.setEditeurLivre(el);
    }

    public void ajoutAuteur() {
        //todo Vérification de la résolution du todo tester unicité auteur
        Auteur al;
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
        int verif = listeAuteurs.search(al);
        if (verif > 0) {
            System.out.println("Auteur déjà encodé\n" + al);
            return;
        }
        listeAuteurs.add(al);
    }

    public void ajoutEditeur() {
        //todo Vérification de la résolution du todo tester unicité editeur
        Editeur el;
        System.out.println("nom :");
        String nom = sc.nextLine();
        System.out.println("adresse :");
        String adresse = sc.nextLine();
        System.out.println("telephone :");
        String tel = sc.nextLine();
        el = new Editeur(nom, adresse, tel);
        int verif = listeEditeurs.search(el);
        if (verif > 0) {
            System.out.println("Editeur déjà encodé\n" + el);
            return;
        }
        listeEditeurs.add(el);
    }

    public void rechTitre() {

        System.out.println("titre recherche");
        String trech = sc.nextLine();
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

    public Livre infosIsbn(String isbn) {

        for (Livre l : catalogue) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void trierCatalogue() {

        Collections.sort(catalogue);//catalogue.sort();
        for (Livre l : catalogue) {
            System.out.println(l);
        }
    }

    public void affichageCatalogue() {
        for (int i = catalogue.size() - 1; i >= 0; i--) {
            System.out.println(catalogue.elementAt(i));
        }
    }

    public void rechercheLivreSelonEditeur() {

        //fixme Ne pas prendre en compte les caractères spéciaux
        System.out.println("nom recherche");
        String nrech = sc.nextLine();
        System.out.println("adresse auteur");
        String arech = sc.nextLine();
        Editeur recherche = new Editeur(nrech, arech, "");

        boolean verifErreur = true;

        for (int i = 0; i < catalogue.size(); i++) {

            Editeur e = catalogue.elementAt(i).getEditeurLivre();

            if (recherche.equals(e)) {
                System.out.println(catalogue.elementAt(i));
                verifErreur = false;
            }
        }

        if (verifErreur) {
            System.out.println("Aucun éditeur avec ce nom et/ou cette adresse n'a été trouvé.");
        }
    }

    public void menu() {
        int ch;
        do {
            System.out.println("1.ajout livre\n2.ajout auteur\n3.ajout éditeur\n4.recherche titre\n5.recherche isbn\n6.trier catalogue\n7.afficher catalogue (ordre inverse d'insertion)\n8.recherche livre selon l'editeur\n9.fin");
            System.out.println("choix :");
            ch = sc.nextInt();
            sc.skip("\n");
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
                    trierCatalogue();
                    break;
                case 7:
                    affichageCatalogue();
                    break;
                case 8:
                    rechercheLivreSelonEditeur();
                    break;
                case 9:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (ch != 9);
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
            case "prod"://rien à faire
                break;
            default:
                System.out.println("mode incorrect");
                System.exit(1);// code d'erreur si !=0
        }
        maBibli.menu();
    }
}

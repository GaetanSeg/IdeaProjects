package Labo3;
import java.util.*;

public class Bibliotheque {

    protected Stack<Livre> catalogue = new Stack<>();
    protected Stack<Auteur> listeAuteurs = new Stack<>();
    protected Stack<Editeur> listeEditeurs = new Stack<>();
    protected Stack<Livre> copyCatalogue = new Stack<>();

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
            System.out.println("livre déjà encodé"+l);
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
        int p=0;
        do {
            System.out.println("position de l'auteur :");
            p = sc.nextInt();
            sc.skip("\n");
        }while(p<0 || p>listeAuteurs.size());

        Auteur al = listeAuteurs.get(p-1);

        l.setAuteurLivre(al);

        i = 0;

        for (Editeur e : listeEditeurs) {
            i++;
            System.out.println(i + ":" + e);
        }

        p=0;
        do {
            System.out.println("position de l'éditeur:");
            p = sc.nextInt();
            sc.skip("\n");
        }while(p<0 || p>listeEditeurs.size());

        Editeur el = listeEditeurs.get(p - 1);
        l.setEditeurLivre(el);
    }

    public void ajoutAuteur() {
        System.out.println("nom :");
        String nom = sc.nextLine();
        Auteur al = infosAuteur(nom);
        if (al != null) {
            System.out.println("Auteur déja encodé " +al);
            return;
        }
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

    public void ajoutEditeur() {
        System.out.println("nom :");
        String nom = sc.nextLine();
        Editeur el = infosEditeur(nom);
        if (el != null) {
            System.out.println("Editeur déjà encodé"+el);
            return;
        }
        System.out.println("adresse :");
        String adresse = sc.nextLine();
        System.out.println("telephone :");
        String tel = sc.nextLine();
        el = new Editeur(nom, adresse, tel);
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
    public Auteur infosAuteur(String nom) {

        for (Auteur a : listeAuteurs) {
            if (a.getNom().equalsIgnoreCase(nom)) {
                return a;
            }
        }
        return null;
    }
    public Editeur infosEditeur(String nom) {

        for (Editeur e : listeEditeurs) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return e;
            }
        }
        return null;
    }
    public void displayAuthorsReverse(){

        copyCatalogue.addAll(catalogue);
        int i=1;
        while(!copyCatalogue.empty()) {

            System.out.println("Extraction n°" + i++ + "\t: " + copyCatalogue.pop());
            System.out.println("---->Taille après extraction = " + copyCatalogue.size());
        }

        System.out.println("Taille du vrai catalogue = " + catalogue.size());
        /*for (int i = catalogue.size()-1;  i>=0 ; i--) {

            System.out.println(catalogue.elementAt(i));
        }*/

    }

    public void bookOfEditors(){

        System.out.println("Nom de l'éditeur désiré : ");
        String nrech = sc.nextLine();
        System.out.println("Adresse de l'éditeur");
        String arech = sc.nextLine();
        Editeur recherche = new Editeur(nrech, arech, "");

        boolean verif=true;

        for (int i = 0; i< catalogue.size();i++ ){

            Editeur e = catalogue.elementAt(i).getEditeurLivre();
            if (recherche.equals(e)){//renvoie True si égalité

                System.out.println(catalogue.elementAt(i));
                verif=false;
            }

            }
        if(verif){

            System.out.println("Aucun éditeur avec ce nom et/ou cette adresse n'a été trouvé.");
        }
    }


    public void trierCatalogue() {

        Collections.sort(catalogue);//catalogue.sort();
        for (Livre l : catalogue) {
            System.out.println(l);
        }
    }

    public void menu() {
        int ch;
        do {
            System.out.println("1.ajout de livre\n2.ajout d'auteur\n3.ajout d'éditeur\n4.recherche titre\n5.recherche isbn\n6.triage du catalogue\n7.affichage du catalogue\n8.livres des editeurs \n9.quitter le programme");
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
                    displayAuthorsReverse();
                    break;
                case 8:
                    bookOfEditors();
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

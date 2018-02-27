package Labo2;

import java.util.Scanner;


public class Bibliotheque {
    private Livre[] livres;
    private Auteur[] auteurs;
    private Editeur[] editeurs;
    private int nbLivres = 0;
    private int test=0;
    private Scanner sc = new Scanner(System.in);

    public Bibliotheque(String mode) {


        switch (mode) {
            case "test":
                populate();
                break;
            case "prod":
                init();
                break;
            default:
                System.out.println(" le mode choisi est incorrect");
                System.exit(1);// code d'erreur si !=0
        }


    }

    private void init() {

        System.out.println("Combien de livre voulez-vous encoder au maximun ? :");
        int nbMax = 0;

        do {

            nbMax = sc.nextInt();
            sc.skip("\n");
        } while (nbMax <= 0);
        livres = new Livre[nbMax];
        editeurs = new Editeur[nbMax];
        auteurs = new Auteur[nbMax];
        nbLivres=nbMax;
    }
    private void menu(){
        int choix;
        do{
            System.out.println("1.ajout \n 2.recherche titre \n 3.recherche isbn \n 4.fin");
            System.out.print("choix :");
            choix=sc.nextInt();
            sc.skip("\n");

            switch(choix){
                case 1:Gestion();break;
                case 2:rechTitre();break;
                case 3:rechIsbn();break;
                case 4:System.out.println("bye");break;
                default:System.out.println("choix invalide");
            }
        }while(choix!=4);
    }
    private void populate() {
        System.out.println("mode test");
        livres = new Livre[10];
        Auteur a = new Auteur("King", "Stephen", 1945, "anglais");
        Editeur e = new Editeur("livre de poche", "Paris", "01234567");
        livres[0] = new Livre("Shining", "12345", 12, e, a);
        livres[1] = new Livre("Le fléau", "23456", 13, e, a);
        a = new Auteur("Cauvin", "Patrick", 1965, "français");
        e = new Editeur("Le masque", "Bruxelles", "0234566");
        livres[2] = new Livre("Les frangins", "343434", 20, e, a);
        e = new Editeur("Editeurs Réunis", "La Louvière", "06434566");
        livres[3] = new Livre("Les frangins", "12444", 15, e, a);
        test=4;
        nbLivres = 4;
    }

    private void Gestion() {


        for (int i = 0; i < nbLivres; i++) {

            System.out.println("entrer Titre");
            String titre = sc.nextLine();

            System.out.println("Isbn du livre");
            String isbn = sc.nextLine();

            System.out.println("le prix du livre");
            float prix = sc.nextFloat();
            sc.skip("\n");

            System.out.println("Entrer le nom de l'editeur");
            String nom = sc.nextLine();

            System.out.println("entrer l'adresse de l'editeur");
            String adresse = sc.nextLine();

            System.out.println("entrer le numero de telephone de l'editeur ");
            String telephone = sc.nextLine();

            editeurs[i] = new Editeur(nom, adresse, telephone);

            System.out.println("Entrer le nom d'auteur");
            nom = sc.next();

            System.out.println("Entrer le prenom de l'auteur ");
            String prenom = sc.next();

            System.out.println("Entrer la date de naissance");
            int date = sc.nextInt();
            sc.skip("\n");

            System.out.println("Entrer la langue");
            String langue = sc.nextLine();


            auteurs[i] = new Auteur(nom, prenom, date, langue);
            livres[i] = new Livre(titre, isbn, prix, editeurs[i], auteurs[i]);


        }
        for (int i = 0; i < nbLivres; i++) {

            System.out.println("information du Livre n° " + i + "\n" + livres[i].getTitre() + "\n" + livres[i].getIsbn() + "\n" + livres[i].getPrix() + "\n" + livres[i].getEditeurLivre() + "\n" + livres[i].getAuteurLivre());
        }
        int choix1=0;
        int choix2=0;

        do {

            System.out.println("encoder le numero du premier livre que vous voulez comparer");
            choix1 = sc.nextInt();
            System.out.println("encoder le numero du second livre que vous voulez comparer");
            choix2 = sc.nextInt();

        }while (choix1<0 && choix1>nbLivres && choix2<0 && choix2>nbLivres );

        if (livres[choix1].getPrix() >= livres[choix2].getPrix())
            System.out.println("le livre le plus cher est " + livres[choix1].getTitre());
        else System.out.println("le livre le plus cher est " + livres[choix2].getTitre());

        float prixtot = livres[choix1].getPrix() + livres[choix2].getPrix();
        System.out.println("le prix total: " + prixtot);

        if (livres[choix1].getEditeurLivre().equals(livres[choix2].getEditeurLivre()) && livres[choix1].getAuteurLivre().equals(livres[choix2].getAuteurLivre())) {

            System.out.println("les deux livres sont du meme auteur et meme editeur");

        } else System.out.println("Les deux livres sont d'auteur et /ou d'editeur differents");

        livres[choix2].setEditeurLivre(livres[choix1].getEditeurLivre());
        livres[choix2].setAuteurLivre(livres[choix1].getAuteurLivre());

        if (livres[choix1].getEditeurLivre().equals(livres[choix2].getEditeurLivre()) && livres[choix1].getAuteurLivre().equals(livres[choix2].getAuteurLivre())) {

            System.out.println("les deux livres sont du meme auteur et meme editeur");

        } else System.out.println("Les deux livres sont d'auteur et /ou d'editeur differents");

//changer la langue de l'auteur
        auteurs[0] = livres[0].getAuteurLivre();
        System.out.println("veuillez entrer la langue désirée :");
        String newLangue = sc.next();
        auteurs[0].setLangue(newLangue);
        System.out.println("la langue de l'auteur" + auteurs[0].getNom() + auteurs[0].getPrenom() + "a été modifier en " + auteurs[0].getLangue());
//

// changer l'adresse de l'editeur
        editeurs[0] = livres[0].getEditeurLivre();
        System.out.println("veuillez entrer la nouvelle adresse ");
        String newAdresse = sc.next();
        sc.skip("\n");
        editeurs[0].setAdresse(newAdresse);
        System.out.println("l'adresse de l'editeur" + editeurs[0].getNom() + "a changer ça nouvelle adresse est " + editeurs[0].getAdresse());
//

    }

    private void rechTitre() {

        System.out.print("titre recherché:");
        String trech = sc.nextLine();
        boolean trouve = false;
        for (int i = 0; i < nbLivres; i++) {
            Livre l = livres[i];
            if (l.getTitre().contains(trech)) {
                System.out.println(l);
                trouve = true;
            }
        }
        if (!trouve) System.out.println("aucun livre trouvé");
    }
    private void rechIsbn(){

        System.out.print("isbn recherché:");
        String irech=sc.nextLine();
        boolean trouve=false;
        for(int i=0;i<nbLivres;i++) {
            Livre l = livres[i];
            if(l.getIsbn().equalsIgnoreCase(irech)){
                System.out.println(l);
                trouve=true;
                break;
            }
        }
        if(!trouve)System.out.println("aucun livre trouvé");
    }

    public static void main(String[] args) {
        if(args.length!=1) {
            System.out.println("nombre d'arguments invalide");
            System.exit(1);//code d'erreur si !=0
        }
        Bibliotheque B1 = new Bibliotheque(args[0]);
        B1.menu();
    }
}

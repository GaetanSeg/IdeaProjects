/*package Labo2;

import java.util.Scanner;

public class Bibliotheque {

    public Bibliotheque(){

    }

    public void Gestion(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Combien de livre voulez-vous ? :");
        int nb=0;

        do {

            nb=sc.nextInt();
            sc.skip("\n");
        }while (nb<=0);


        Livre [] livres=new Livre[nb];
        Auteur[] auteurs= new Auteur[nb];
        Editeur[] editeurs= new Editeur[nb];

        for (int i=0;i<nb;i++) {

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
            String telephone = sc.next();

            editeurs[i]  = new Editeur(nom, adresse, telephone);

            System.out.println("Entrer le nom d'auteur");
            nom = sc.next();

            System.out.println("Entrer le prenom de l'auteur ");
            String prenom = sc.next();

            System.out.println("Entrer la date de naissance");
            int date = sc.nextInt();
            sc.skip("\n");

            System.out.println("Entrer la langue");
            String langue = sc.nextLine();


            auteurs[i]  = new Auteur(nom, prenom, date, langue);
            livres[i]  = new Livre(titre, isbn, prix, editeurs[i], auteurs[i]);

            System.out.println("entrer Titre");
            titre = sc.nextLine();

            System.out.println("Isbn du livre");
            isbn = sc.nextLine();

            System.out.println("le prix du livre");
            prix = sc.nextFloat();
            sc.skip("\n");

            System.out.println("Entrer le nom de l'editeur");
            nom = sc.nextLine();

            System.out.println("entrer l'adresse de l'editeur");
            adresse = sc.nextLine();

            System.out.println("entrer le numero de telephone de l'editeur ");
            telephone = sc.next();
            sc.skip("\n");
        }
        Editeur e2= new Editeur(nom,adresse,telephone);

        System.out.println("Entrer le nom d'auteur");
        nom=sc.nextLine();

        System.out.println("Entrer le prenom de l'auteur ");
        prenom=sc.nextLine();

        System.out.println("Entrer la date de naissance");
        date=sc.nextInt();

        System.out.println("Entrer la langue");
        langue=sc.nextLine();

        Auteur a2 = new Auteur(nom,prenom,date,langue);
        Livre l2=new Livre(titre,isbn,prix,e2,a2);


        for (int i=0;i<nb;i++) {
        System.out.println("entrer les valeurs demander pour le livre 1");
        l1.init();
            System.out.println("information du premier livre \n" + livres[i].getTitre() + "\n" + livres[i].getIsbn() + "\n" + livres[i].getPrix() + "\n" + livres[i].getEditeurLivre() + "\n" + livres[i].getAuteurLivre());

        /*System.out.println("entrer les valeurs demander pour le livre 2");
        l2.init();
    /*System.out.println("information du deuxieme livre \n" + l2.getTitre() + "\n" + l2.getIsbn() + "\n" + l2.getPrix() + "\n" + l2.getEditeurLivre() + "\n" + l2.getAuteurLivre());

        }

        /*if (l1.getPrix()>=l2.getPrix()) System.out.println("le livre le plus cher est " + l1.getTitre());
        else System.out.println("le livre le plus cher est " + l2.getTitre());

        float prixtot = l1.getPrix()+l2.getPrix();
        System.out.println("le prix total: "+prixtot);

        if(l1.getEditeurLivre().equals(l2.getEditeurLivre()) && l1.getAuteurLivre().equals(l2.getAuteurLivre())){

            System.out.println("les deux livres sont du meme auteur et meme editeur");

        }else System.out.println("Les deux livres sont d'auteur et /ou d'editeur differents");

        l2.setEditeurLivre(l1.getEditeurLivre());
        l2.setAuteurLivre(l1.getAuteurLivre());

        if(l1.getEditeurLivre().equals(l2.getEditeurLivre()) && l1.getAuteurLivre().equals(l2.getAuteurLivre())){

            System.out.println("les deux livres sont du meme auteur et meme editeur");

        }else System.out.println("Les deux livres sont d'auteur et /ou d'editeur differents");

//changer la langue de l'auteur
        a1 = l1.getAuteurLivre();
        System.out.println("veuillez entrer la langue désirée :");
        String newLangue=sc.next();
        a1.setLangue(newLangue);
        System.out.println("la langue de l'auteur"+a1.getNom()+a1.getPrenom()+"a été modifier en "+a1.getLangue());
//

// changer l'adresse de l'editeur
        e1 = l1.getEditeurLivre();
        System.out.println("veuillez entrer la nouvelle ");
        String newAdresse=sc.nextLine();
        sc.skip("\n");
        e1.setAdresse(newAdresse);
        System.out.println("l'adresse de l'editeur"+e1.getNom()+"a changer ça nouvelle adresse est "+e1.getAdresse());
//

    }

    public  static void main(String[] args) {

        Bibliotheque B1 = new Bibliotheque();
        B1.Gestion();
    }
}
*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class Bibliotheque {

   private List<Livre> catalogue = new ArrayList<>();

   private Scanner sc = new Scanner(System.in);

    public Bibliotheque() {
    }

    private void menu() {
      
        int ch;
        do {
            System.out.println("1.ajout \n2.recherche titre\n3.recherche isbn\n4.suppression\n5.fin");
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
                      suppLivre();
                    break;
                case 5:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (ch != 5);
    }

    private void populate() {
        System.out.println("mode test");
        Auteur a = new Auteur("King", "Stephen", 1945, "anglais");
        Editeur e = new Editeur("livre de poche", "Paris", "01234567");
        catalogue.add(new Livre("Shining", "12345", 12.50, e, a));
        catalogue.add(new Livre("Le fléau", "23456", 13.50, e, a));
        a = new Auteur("Cauvin", "Patrick", 1965, "français");
        e = new Editeur("Le masque", "Bruxelles", "0234566");
        catalogue.add(new Livre("Les frangins", "343434", 20.5, e, a));
        e = new Editeur("Editeurs Réunis", "La Louvière", "06434566");
        catalogue.add(new Livre("Les frangins", "12444", 15.0, e, a));

    }

    private void ajout() {
        System.out.println("isbn");
        String isbn = sc.nextLine();
        Livre l= infosIsbn(isbn);
        if(l!=null){
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

        System.out.println("nom :");
        String nom = sc.nextLine();
        System.out.println("prénom :");
        String prenom = sc.nextLine();
        System.out.println("annee :");
        int annee = sc.nextInt();
        sc.skip("\n");
        System.out.println("langue :");
        String langue = sc.nextLine();
        Auteur al = new Auteur(nom, prenom, annee, langue);

        System.out.println("nom :");
        nom = sc.nextLine();
        System.out.println("adresse :");
        String adresse = sc.nextLine();
        System.out.println("telephone :");
        String tel = sc.nextLine();
        Editeur el = new Editeur(nom, adresse, tel);

        l = new Livre(titre, isbn, prix,el,al);
        catalogue.add(l);
    }

    public void rechTitre() {
        boolean trouve=false;
        System.out.println("titre recherche");
        String trech = sc.nextLine();
        
        for (Livre l : catalogue) {
            if (l.getTitre().toLowerCase().contains(trech.toLowerCase())) {
                System.out.println(l);
                trouve=true;
            }
        }
       if(!trouve)System.out.println("titre introuvable");
    }
    
    public void rechIsbn(){
      System.out.println("isbn recherche");
      String isbnRech = sc.nextLine();
      Livre l = infosIsbn(isbnRech);
      if(l!=null)System.out.println(l);
      else System.out.println("isbn introuvable");
    }
    
    public void suppLivre(){//utiliser iterators
      System.out.println("isbn recherche");
      String isbnRech = sc.nextLine();
      Livre l = infosIsbn(isbnRech);
      if(l!=null){
          catalogue.remove(l);
          System.out.println("suppression effectuée");
      }
      else System.out.println("isbn introuvable");
    }
    public Livre infosIsbn(String isbn) {
       
            
        for (Livre l : catalogue) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
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

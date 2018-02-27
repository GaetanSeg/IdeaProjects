package labo2;

import java.util.*;
public class Bibliotheque {
 public static void main(String[] args){
     Livre l1=new Livre();
     l1.init();
     Livre l2=new Livre();
     l2.init();
     System.out.println("Livre 1");
     System.out.println(l1);
     System.out.println("Livre 2");
     System.out.println(l2);
     if(l1.getPrix()>l2.getPrix())System.out.println("le livre le plus cher est "+l1.getTitre());
      else if(l1.getPrix()<l2.getPrix()) System.out.println("le livre le plus cher est "+l2.getTitre());
        else System.out.println("les deux livres ont le même prix");
     double ptot=l1.getPrix()+l2.getPrix();
     System.out.println("Le prix total des deux livres est "+ptot+ "euros ");
      if(l1.getAuteurLivre().equals(l2.getAuteurLivre())&&l1.getEditeurLivre().equals(l2.getEditeurLivre()))
         System.out.println("même auteur et même éditeur");
         else System.out.println("auteur et/ou éditeur différents");
     l2.setAuteurLivre(l1.getAuteurLivre());
     l2.setEditeurLivre(l1.getEditeurLivre());
     if(l1.getAuteurLivre().equals(l2.getAuteurLivre())&&l1.getEditeurLivre().equals(l2.getEditeurLivre()))
         System.out.println("même auteur et même éditeur");
         else System.out.println("auteur et/ou éditeur différents");
     Auteur a1=l1.getAuteurLivre();
      System.out.println("nouvelle langue de l'auteur "+a1.getPrenom()+" "+a1.getNom());
     Scanner sc=new Scanner(System.in);
     String nl=sc.nextLine();
     a1.setLangue(nl);
     Editeur e1=l1.getEditeurLivre();
     System.out.println("nouvelle adresse de l'éditeur "+e1.getNom());
     String na=sc.nextLine();
     e1.setAdresse(na);
     System.out.println("la langue de l'auteur du premier livre est "+a1.getLangue());
     System.out.println("l'adresse de l'éditeur du premier livre est "+e1.getAdresse());

     Auteur a2=l2.getAuteurLivre();
     Editeur e2=l2.getEditeurLivre();
     System.out.println("la langue de l'auteur du deuxième livre est "+a2.getLangue());
     System.out.println("l'adresse de l'éditeur du deuxième livre est "+e2.getAdresse());

 }
}


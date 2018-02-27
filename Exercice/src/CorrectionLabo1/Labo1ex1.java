package CorrectionLabo1;

import java.util.Scanner;

public class Labo1ex1{

    public static void main(String[] args){
        String nom,prenom,mp;
        String mp1,mp2;
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.println("nom :");
        nom=sc.nextLine();
        System.out.println("prénom :");
        prenom=sc.nextLine();
        int ln=nom.length();
        mp1=nom.substring(0,(ln>=2?2:ln));
        int lp=prenom.length();
        mp2=prenom.substring((lp>=3?lp-3:0));
        l=ln+lp;
        mp=mp1+mp2+l;
        System.out.println("mot de passe = "+mp);
    }
}


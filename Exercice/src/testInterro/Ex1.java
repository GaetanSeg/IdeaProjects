package testInterro;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        System.out.println("Votre nom");
        String nom=sc.nextLine();

        System.out.println("votre prenom");
        String prenom=sc.nextLine();

        int sizeN = nom.length();
        int sizeP = prenom.length();

        String mp1= nom.substring(0,(sizeN>=2?2:sizeN));
        String mp2 = prenom.substring((sizeP>=3?sizeP-3:0));

        int sizeTot=sizeN+sizeP;

        password=mp1+mp2+sizeTot;

        System.out.println("Votre mot de passe est "+password);


    }
}

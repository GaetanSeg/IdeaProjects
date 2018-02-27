package testInterro;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class interroex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate dateD1,dateD2,dateP1,dateP2;
        String nomP1, nomP2;
        int j = 0, m = 0, a = 0;
        boolean dateValide = false;
        boolean dateNotValide = true;

        //personnes n°1
        System.out.println("encodez le nom complet de la premiere personne (ex: seggiogaetan)");
        nomP1 = sc.nextLine();
        do {
            do {


                System.out.println("entrez la date de naissance de la premiere personne (jj/mm/aaaa):");
                j = sc.nextInt();
                m = sc.nextInt();
                a = sc.nextInt();
                dateP1 = LocalDate.of(a, m, j);
                LocalDate now = LocalDate.now();
                dateValide = dateP1.isBefore(now);

                if (dateValide == false) {

                    System.out.println("la date que vous avez entrer en erroné ");
                }

                sc.skip("\n");
            } while (dateValide == false);
//date de deces

            System.out.println("entrez la date de décès de la premiere personne (jj/mm/aaaa):");
            j = sc.nextInt();
            m = sc.nextInt();
            a = sc.nextInt();
            dateD1 = LocalDate.of(a, m, j);
            dateNotValide = dateD1.isBefore(dateP1);

            if (dateNotValide == true) {

                System.out.println("la date que vous avez entrer en erroné ");
            }

            sc.skip("\n");
        } while (dateNotValide == true);


        //personnes n°2
        System.out.println("encodez le nom complet de la deuxieme personne (ex: seggiogaetan)");
        nomP2 = sc.nextLine();
        do {
            do {


                System.out.println("entrez la date de naissance de la deuxieme personne (jj/mm/aaaa):");
                j = sc.nextInt();
                m = sc.nextInt();
                a = sc.nextInt();
                dateP2 = LocalDate.of(a, m, j);
                LocalDate now = LocalDate.now();
                dateValide = dateP2.isBefore(now);

                if (dateValide == false) {

                    System.out.println("la date que vous avez entrer en erroné ");
                }

                sc.skip("\n");
            } while (dateValide == false);
//date de deces

            System.out.println("entrez la date de décès de la premiere personne (jj/mm/aaaa):");
            j = sc.nextInt();
            m = sc.nextInt();
            a = sc.nextInt();
            dateD2 = LocalDate.of(a, m, j);
            dateNotValide = dateD2.isBefore(dateP2);

            if (dateNotValide == true) {

                System.out.println("la date que vous avez entrer en erroné ");
            }

            sc.skip("\n");
        } while (dateNotValide == true);


        Period p1 = dateP1.until(dateD1);
        Period p2 = dateP2.until(dateD2);

        int annee1 = p1.getYears();
        int annee2 = p2.getYears();

        if (annee1 > annee2) {

            System.out.println(nomP1);
        } else System.out.println(nomP2);

        if (annee1==annee2){
            System.out.println("ex-aequo");
        }

    }
}

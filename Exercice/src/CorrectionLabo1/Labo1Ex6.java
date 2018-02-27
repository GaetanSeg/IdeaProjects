package CorrectionLabo1;

import java.util.*;
public class Labo1Ex6 {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("indiquez votre capital :");
        int capital =sc.nextInt();
        System.out.println("indiquez votre taux d'intérêt en % :");
        float interet=sc.nextFloat();
        System.out.println("indiquez le nombre d'année dont vous souhaitez calculer le capital:");
        int nbrAnnee=sc.nextInt();


        for(int i=0; i<=nbrAnnee;i++){
            System.out.println("Annee "+i+", vous avez "+capital);
            capital =(int) (capital+capital*interet/100);
        }
    }
}

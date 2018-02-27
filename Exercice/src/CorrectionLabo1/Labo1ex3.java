package CorrectionLabo1;

import java.util.*;

public class Labo1ex3{

    public static void main(String[] args){

        Scanner fr = new Scanner(System.in) ;
        System.out.print("Entrez le numérateur de la premiere fraction") ;
        int num1=fr.nextInt();
        System.out.print("Entrez le dénominateur de la premiere fraction") ;
        int den1=fr.nextInt();
        System.out.println("La premiere fraction est " +num1+ "/"+ den1);

        System.out.print("Entrez le numerateur de la deuxieme fraction") ;
        int num2=fr.nextInt();
        System.out.print("Entrez le denominateur de la deuxieme fraction") ;
        int den2=fr.nextInt();
        System.out.println("La deuxieme fraction est " +num2+ "/"+ den2);


        int sommenum = (num1*den2) + (num2*den1) ;
        int sommeden = (den1)*(den2) ;
        System.out.println("La somme est " +sommenum+ "/" +sommeden);

        int differencenum = (num1*den2) - (num2*den1) ;
        int differenceden = (den1)*(den2) ;
        System.out.println("Le quotient est " +differencenum+ "/" +differenceden);

        int produitnum = num1*num2 ;
        int produitden = den1*den2 ;
        System.out.println("Le produit est " +produitnum+ "/" +produitden);

        int quotientnum = num1*den2 ;
        int quotientden = num2*den1 ;
        System.out.println("Le quotient est " +quotientnum+ "/" +quotientden);

    }

}

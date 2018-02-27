package CorrectionLabo1;

import java.util.*;

public class Labo1ex2{
    public static void main(String[] args) {
        Scanner nbre = new Scanner(System.in);
        System.out.println("Premier nombre ? ");
        int nbre1 = nbre.nextInt();

        System.out.println("Nombre suivant ? ");
        int nbre2 = nbre.nextInt();

        int somme = nbre1+nbre2;
        int diff = nbre1-nbre2;
        int prod = nbre1*nbre2;
        float divis = (float) nbre1/(float) nbre2;

        System.out.println("La somme des nombres est egale "+somme+"\n");
        System.out.println("La difference des nombres est egale "+diff+"\n");
        System.out.println("Le produit des nombres est egale "+prod+"\n");
        System.out.println("La division des nombres est egale "+divis+"\n");

    }
}


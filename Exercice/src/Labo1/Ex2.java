import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nbr1,nbr2,som,diff,prod;
        float quot;

        System.out.println("entrer votre nbr1");
        nbr1=sc.nextDouble();

        System.out.println("entrer votre nbr2");
        nbr2=sc.nextDouble();

        som=nbr1+nbr2;
        diff=nbr1-nbr2;
        prod=nbr1*nbr2;
        quot=(float)nbr1/(float)nbr2;

        System.out.println("la somme est de "+som );
        System.out.println("la difference esr de "+diff);
        System.out.println("le produit est de "+prod);
        System.out.println("le quotient est de "+quot);
    }


}

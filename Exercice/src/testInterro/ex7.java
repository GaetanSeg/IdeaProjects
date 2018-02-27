package testInterro;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int j=0,m=0,a=0;
        Scanner sc=new Scanner(System.in);
        LocalDate dateN;

        System.out.println("encoder l'annee souhaiter sous la forme suivante jj/mm/aaaa : ");
        //j=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();
        LocalDate now = LocalDate.now();
        dateN=LocalDate.of(a,m,j);

        Period p= dateN.until(now);

        int days=p.getDays();
        int month=p.getMonths();
        int years=p.getYears();

        System.out.println("cette date nous séparent de "+days+"jours"+month+"mois"+years+"ans");



    }
}

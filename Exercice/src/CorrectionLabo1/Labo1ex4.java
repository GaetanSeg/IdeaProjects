package CorrectionLabo1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Labo1ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("date de naissance (j m a) :");
        int j=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        LocalDate j1=LocalDate.of(a, m, j);
        LocalDate j2=LocalDate.now();
        Period p = j1.until(j2);
        int age = p.getYears();
        System.out.println("age = "+age+ " ans");

    }
}
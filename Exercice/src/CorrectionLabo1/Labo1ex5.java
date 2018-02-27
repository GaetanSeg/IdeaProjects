package CorrectionLabo1;

import java.util.Scanner;

public class Labo1ex5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String ph1,ph2;
        System.out.println("encodez votre phrase :");
        ph1=sc.nextLine();
       // ph1=ph1.replaceAll(" ","");
        StringBuffer sb=new StringBuffer(ph1);
        sb=sb.reverse();
        ph2=sb.toString();
        System.out.println(ph2);
        System.out.println((ph1.equalsIgnoreCase(ph2)?"":"pas ")+"palindrome");

    }
}
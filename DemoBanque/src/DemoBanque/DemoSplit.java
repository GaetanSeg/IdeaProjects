package DemoBanque;

import java.util.Scanner;

public class DemoSplit {

    public static void main(String[] args) {

        int i=0;
        String numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("numero de compte");
        numero=sc.next();
        String[] elts = numero.split("-");

       for (String str : elts){
           System.out.println(elts[i]);
           i++;
       }

    }
}

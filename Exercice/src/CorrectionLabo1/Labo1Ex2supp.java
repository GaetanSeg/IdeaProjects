package CorrectionLabo1;

import java.util.Scanner;

public class Labo1Ex2supp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n de compte");
        String num=sc.next();
        String nb=num.substring(0,3);
        String nc=num.substring(4,11);
        String ctrls = num.substring(12);
        String vals=nb+nc;
        long val=Long.parseLong(vals);
        long ctrl=Long.parseLong(ctrls);
        if(val%97 == ctrl) System.out.println("ok");
        else System.out.println("erreur");
    }

}

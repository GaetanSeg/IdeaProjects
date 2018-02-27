package interro2017_2018;

import java.util.Scanner;

public class ex2 {
       static void  transform () {
        Scanner sc = new Scanner(System.in);
        System.out.println("votre phrase :");
        String ph = sc.nextLine();
        StringBuilder sb=new StringBuilder();
        StringBuilder sbReverse=new StringBuilder();
           ph=ph.replaceAll(" ","");

        for(int i=0;i<ph.length();i++){
            char c=ph.charAt(i);

            if(c=='a'||c=='e'|| c=='i'||c=='u'||c=='o'||c=='y' ){
                sb.append(c);
                sbReverse.append(c);
            }
        }
        sbReverse.reverse();

        System.out.println(sb);
        System.out.println(sbReverse);
    }

    public static void main(String[] args) {

        ex2 test= new ex2();
        test.transform();

    }
}

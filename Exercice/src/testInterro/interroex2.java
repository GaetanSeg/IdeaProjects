package testInterro;

import java.util.Scanner;

public class interroex2 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("votre phrase :");
            String ph = sc.nextLine();
            StringBuilder sb=new StringBuilder();
            StringBuilder sbTot=new StringBuilder();
            for(int i=0;i<ph.length();i++){
                char c=ph.charAt(i);
                if(c==' '){
                    if(sb.length()>0) {
                        sb.reverse();
                        sbTot.append(sb);
                        sb.delete(0,sb.length());
                    }
                    sbTot.append(c);
                }
                else sb.append(c);
            }
            //sbTot.append(sb.reverse());//dernier mot
            System.out.println(sbTot);

    }
}

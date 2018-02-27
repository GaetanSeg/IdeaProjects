package DemoBanque;
import java.util.Scanner;
public class Demoargs {

    public static void main(String[] args) {
       /* for(int i=0 ;i<args.length;i++){

            System.out.println(args[i]);
        }*/

        int []nbres ;
        Scanner sc=new Scanner(System.in);
       if(args.length==0){

           System.out.println("mode incorrecte");
           System.exit(1);
       }

       if (!(args[0].equals("test")) && !(args[0].equals("prod"))){

           System.out.println("mode incorrecte");
           System.exit(1);
       }
       if (args[0].equals("prod")) {

           nbres = new int[5];
           for (int i = 0; i < 5; i++) {
               System.out.println("nbre n°" + (i + 1));
               nbres[i] = sc.nextInt();
           }
       }
           int s=0;
           nbres = new int[]{4, 7, -3, 2, 5};
           for (int i=0;i<5;i++) s+= nbres[i];
           System.out.println("somme ="+s);
        //
    }
}

import  java.util.Scanner;

public class ex2Supp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String numbCompt,numSansReste,reste97;
        long reste;


        System.out.println("encoder votre numéro de compte");
        numbCompt=sc.nextLine();
        System.out.println("votre numero de compte est :"+numbCompt);

//remplacement des caracteres "-" par un rien :p
//convertion d'un string en nombres

        numbCompt=numbCompt.replaceAll("-","");
        numSansReste=numbCompt.substring(0,10);
        reste97=numbCompt.substring(10,12);

        System.out.println(numSansReste+" "+reste97);

        long numb= Long.parseLong(numSansReste);
        long resteOf97= Long.parseLong(reste97);
        reste=numb%97;

//condition de validation ;
        if (reste==resteOf97){

            System.out.println("votre numéro de compte est valide ");

        }else System.out.println("votre numéro de compte est invalide");
    }
}

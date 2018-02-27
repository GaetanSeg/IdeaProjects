import java.util.Arrays;
import java.util.Scanner;

public class Ex1Supp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,sizeTabString=0;
        String phoneNum;
        String test = null;
        String[] prefixe = {"03", "053", "063","068","02"};
        String[] regionPrefixe = {"Anvers","Arlon","Alost","Ath","Bruxelles"};

        System.out.println("veuillez entrez un numero de telephone");
        phoneNum=sc.next();
        System.out.println("votre numero est le  "+phoneNum);

//  j'extrais une partie de la chaine qui m'interresee pour la condition

        phoneNum = phoneNum.substring(0, phoneNum.indexOf("/"));
//
// cette boucle sert a connaitre le nombre d'element de  mon tableau

        for (String str : prefixe){

            j++;

        }

        sizeTabString=j;

//
        for (i=0;i<sizeTabString;i++){

            if(phoneNum.equals(prefixe[i])){

                System.out.println("votre prefix est "+prefixe[i]+" ce qui correspond a "+regionPrefixe[i]);
                return;

            }else if(i==sizeTabString-1){

                System.out.println("votre prefixe ne correspond à aucune region en belgique ");
                return;
            }

        }


    }
}

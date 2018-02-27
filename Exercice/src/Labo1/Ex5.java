
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int i = 0, stringSize;
        boolean resultat=true;
        Scanner lecteur = new Scanner(System.in);
        String word;

        System.out.println("veuillez encoder votre mot");
        word = lecteur.nextLine();
        stringSize = word.length();
        System.out.println("votre mot est "+ word + " et est de taille " + stringSize);

        char[] wordTab = word.toCharArray();

        while (i <= stringSize / 2) {

            if (wordTab[i] != wordTab[stringSize - 1 - i]) {

                resultat = false;

            }

            i++;
        }
        if (resultat == true) {

            System.out.println("votre mot est pâlindrome");

        } else System.out.println("votre mot n'est pas pallindrome");
    }
}

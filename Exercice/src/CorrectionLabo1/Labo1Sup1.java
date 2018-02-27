package CorrectionLabo1;

import java.util.Scanner;

public class Labo1Sup1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("tel : ");
        String tel = sc.next();// 064/334455 ou 02/333667
        int ps = tel.indexOf("/");
        if (ps < 0) {
            System.out.println("préfixe invalide");
            System.exit(1);
        }
        String pref = tel.substring(0, ps);
        String reg;
        switch (pref) {
            case "02":
                reg = "BXL";
                break;
            case "064":
                reg = "LL";
                break;
            case "071":
                reg = "CHRL";
                break;
            default:
                reg = "inconnue";

        }
        System.out.println("region :" + reg);

    }
}
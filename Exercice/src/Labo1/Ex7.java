import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;


import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("date de naissance (j m a) :");
        int j = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        LocalDate unJour = LocalDate.of(a, m, j);
        LocalDate dateNow = LocalDate.now();
        Period p = unJour.until(dateNow);
        int annee = p.getYears();
        int mois = p.getMonths();
        int jour =p.getDays();

        System.out.println(p.getDays()+" jours "+ p.getMonths()+" mois "+ " et "+ p.getYears()+ "années");
    }
}
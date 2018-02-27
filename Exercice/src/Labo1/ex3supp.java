import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ex3supp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("date de naissance (jj mm aaaa) :");
        int j = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        LocalDate birth = LocalDate.of(a, m, j);
        LocalDate dateNow = LocalDate.now();
        Period p = birth.until(dateNow);
        int annee = p.getYears();
        System.out.println("vous avez "+annee+" ans ");
        int anneeNow = dateNow.getYear();
        LocalDate birthday= LocalDate.of(anneeNow,m,j);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
        String Annif = birthday.format(dtf);
        System.out.println("votre prochain anniversaire sera le " +Annif);

    }
}

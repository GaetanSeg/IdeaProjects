package testInterro;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0,m=0,a=0;

        System.out.println("entrez votre date de naisance jj//mm//aaaa");
        j=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();

        LocalDate dateB =  LocalDate.of(a,m,j);
        LocalDate dateNow = LocalDate.now();
        Period p = dateB.until(dateNow);

        int age = p.getYears();

        System.out.println("vous avez "+age+"ans");




    }
}

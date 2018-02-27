import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

//  w  ww  .  ja  va  2  s.  c  om
public class test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,m=0;
        System.out.println("veillez encoder votre date sous forme mm/aaaa :");
        m=sc.nextInt();
        a=sc.nextInt();


        LocalDate date = Year.of(a).atMonth(m).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        System.out.printf("%s%n", date);
        /*while (mi == m) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }*/
    }
}
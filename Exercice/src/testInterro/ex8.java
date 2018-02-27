package testInterro;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.Month;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=0,m=0;
        System.out.println("veillez encoder votre date sous forme mm/aaaa :");
        m=sc.nextInt();
        a=sc.nextInt();

        /*YearMonth moisEtAnnee= YearMonth.of(a,m);
        int monthL=moisEtAnnee.lengthOfMonth()

        System.out.println("votre date est "+moisEtAnnee+" et comporte "+monthL+"jours");*/

        LocalDate date= LocalDate.of(a,m,1);

        DayOfWeek dayOfWeek1 = DayOfWeek.from(date);
        System.out.println(dayOfWeek1);
        int intValue = dayOfWeek1.getValue();
        System.out.println(intValue);
        DayOfWeek  dayOfWeek2 = date.getDayOfWeek();
        System.out.println(dayOfWeek2);
        DayOfWeek  dayOfWeekFromInteger = DayOfWeek.of(7);
        System.out.println(dayOfWeekFromInteger);
        DayOfWeek  dayOfWeekAdded = dayOfWeekFromInteger.plus(1);
        System.out.println(dayOfWeekAdded);
        DayOfWeek  dayOfWeekSubtracted = dayOfWeekFromInteger.minus(2);
        System.out.println(dayOfWeekSubtracted);
    }
}

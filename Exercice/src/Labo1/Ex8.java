import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.abs;



    class Temps {
        String[] jour = {"dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"};
        String[] mois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
        public Temps() {
            Calendar now = Calendar.getInstance();

            System.out.println("Current Day is : " + jour[(now.get(Calendar.DAY_OF_WEEK)) - 1]);
            System.out.println("Current Date is : " + now.get(Calendar.DATE));
            System.out.println("Current Month is : " + mois[(now.get(Calendar.MONTH))]);
            System.out.println("Current Year is : " + now.get(Calendar.YEAR));
            System.out.println(jour[(now.get(Calendar.DAY_OF_WEEK)) - 1] + " " + now.get(Calendar.DATE) + " " + mois[(now.get(Calendar.MONTH))] + " " + now.get(Calendar.YEAR));
            System.out.println(now.get(Calendar.DATE) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.YEAR));
            now.set(2015, 7, 26);
            System.out.println(now.get(Calendar.DATE) + "/" + (now.get(Calendar.MONTH)) + "/" + now.get(Calendar.YEAR));
            System.out.println(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH)) + "-" + now.get(Calendar.DATE));
            now.set(2015, 1, 32); //1 indique le mois de février
            System.out.println(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH)) + "-" + now.get(Calendar.DATE));
            now.setLenient(false); //apparemment n'en tient pas compte
            System.out.println(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH)) + "-" + now.get(Calendar.DATE));
        }
        public static void main(String args[]) {
            new Temps();
        }
    }
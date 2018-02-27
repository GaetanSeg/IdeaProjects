package interro2017_2018;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class test {

    static LocalDate lecturePremiereDate(){
        int j,m,a;
        LocalDate now=LocalDate.now();
        LocalDate dateStart;
        Scanner sc= new Scanner(System.in);
        do{
            j=sc.nextInt();
            m=sc.nextInt();
            a=sc.nextInt();
            dateStart=LocalDate.of(a,m,j);
            if(dateStart.isBefore(now)){
                System.out.println("date impossible");
                continue;
            }
            break;
        } while(true);
        return dateStart;
    }

     static void gestion() {

        Scanner sc =new Scanner(System.in);

        int j=0,m=0,a=0;
        boolean validiter;
        float mensualiter=0,credit=0;
        LocalDate d2;


        System.out.println("entez la date de la premiere mensualiter sous forme jj/m/aaaa");
        LocalDate d1=lecturePremiereDate();
        do {
            System.out.println("entrez la date de la dernierre mensualiter sous forme /mm/aaa");
            d2=lecturePremiereDate();
            validiter = d2.isBefore(d1);

            if (validiter==true){
                System.out.println("la date que vous avez rentrer est erroné");
            }

        }while (validiter==true);
        System.out.println("entrez le montant de votre credit ");
        credit= sc.nextFloat();
        Period p ;
        p=d1.until(d2);
        int mois=p.getMonths();
        int ans=p.getYears();
         System.out.println(mois);
         System.out.println(ans);
         int div = (mois+1)*ans;
         System.out.println(div);
        mensualiter=credit/div;
        double newMensualiter = (double) Math.round(mensualiter * 100) / 100;

        System.out.println("Vos mensualiter commencerront le  "+d1+" et se terminerons le "+d2+" la mensualiter pour chaque mois sera de "+newMensualiter+" euros");

    }

    public static void main(String[] args) {
        test ex2=new test();
        ex2.gestion();
    }
}

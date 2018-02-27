import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,deno1,num2,deno2,som = 0,diff=0,prod;
        float quot;

        System.out.println("numerateur :");
        num1=sc.nextDouble();

        System.out.println("denonateur");
        deno1=sc.nextDouble();

        System.out.println("numerateur :");
        num2=sc.nextDouble();

        System.out.println("denonateur");
        deno2=sc.nextDouble();

//somme
        if(deno1==deno2){

            som=(num1+num2)/deno1;

        }
        else if(deno1!=deno2)
        {
            som=(num1*deno2+num2*deno1)/deno1*deno2;
        }

//soustraction


//multiplication

        prod=(num1*num2)/(deno1*deno2);
//division
        quot=(float)(num1/num2)*(float) (deno2/deno1);

        System.out.println("vos opération sont somme : "+som+" soustraction "+diff+" multiplication "+prod+" divisioin "+quot);
    }

}

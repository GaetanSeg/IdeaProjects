
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        int yearsTot=0;
        float somme=0,taux=0,interet=0,sommeTot=0;
        Scanner sc=new Scanner(System.in);
        
       System.out.printf("Quel est la somme a placée:\n");
       somme=sc.nextInt();
       
       System.out.printf("Pour combien d'année la somme doit être placée ?:\n");
       yearsTot=sc.nextInt();
       
       System.out.printf("Quel est le taux d'interets ?:\n");
       taux=sc.nextInt();
       
       taux=taux/100;
       sommeTot=somme;
       
       for(int i=0;i<yearsTot;i++){
           
          interet=(float)sommeTot*taux*12/12;
          sommeTot=sommeTot+interet;
          System.out.printf("votre somme s'èlève à %.1f euros vous bénéficiez donc pour la %d annsée %.1f \n",sommeTot,i+1,interet);
          
       }   
       
    }
}

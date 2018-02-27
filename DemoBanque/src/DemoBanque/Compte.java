package DemoBanque;

import java.util.Scanner;



public class Compte {

    private String numero;
    private double credit;
    private double debit;
    private double solde;

    public Compte() { // le constructeur de la class
        this.numero = "";
        this.credit = 0;
        this.debit = 0;
        this.solde = 0;
    }



    public void init() {
        Scanner sc = new Scanner(System.in);
        double somme;

        System.out.println("numéro");
        this.numero = sc.next();

        do {
            System.out.println("dépot initial : ");
            somme = sc.nextDouble();
            if (somme <= 0) {
                System.out.println("montant strictement possitif");
            }
        } while (somme <= 0);
        this.credit=somme;
        majSolde();
    }

    public void depot(){
        Scanner sc=new Scanner(System.in);
        double somme;

        do {
            System.out.println("Montant du dépot  : ");
            somme = sc.nextDouble();
            if (somme <= 0) {
                System.out.println("montant strictement possitif");
            }
        } while (somme <= 0);
        this.credit+=somme;
        majSolde();

    }

    public void retrait(){
        Scanner sc=new Scanner(System.in);
        double somme;

        do {
            System.out.println("Montant du retrait  : ");
            somme = sc.nextDouble();
            if (somme <= 0) {
                System.out.println("montant strictement possitif");
            }
        } while (somme <= 0);
        if(this.solde-somme<-1250){

            System.out.println("Votre solde est insufisant ");
            return;
        }

        this.debit+=somme;
        majSolde();

    }
    public String getNumero() {
        return this.numero;
    }

    public double getSolde(){
        return this.solde;
    }

    private void majSolde(){

        this.solde=this.credit-this.debit;
    }
}

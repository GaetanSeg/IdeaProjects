package DemoBanque;

import java.util.Scanner;

public class Client {
    private String numero;
    private String nom;
    private String prenom;
    private String adresse;
    private Compte monCompte;

    public Client(){ //constructeur par défaut
        this.numero="";
        this.nom="";
        this.prenom="";
        this.adresse="";
        this.monCompte=null;
    }
    public void init() {
        Scanner lecteur = new Scanner(System.in);
        System.out.println("numero de client = ");
        this.numero = lecteur.next();
        System.out.println("nom du client = ");
        this.nom = lecteur.next();
        System.out.println("prenom du client = ");
        this.prenom = lecteur.next();
        System.out.println("adresse du client = ");
        this.adresse = lecteur.next();
        this.monCompte = new Compte();
        this.monCompte.init();
        System.out.println("client créé");
    }
    public String getNumero(){
        return this.numero;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public Compte getCompte(){
        return this.monCompte;
    }
    public void setAdresse(String adresse){
        this.adresse= adresse;
    }
}//fin de la classe

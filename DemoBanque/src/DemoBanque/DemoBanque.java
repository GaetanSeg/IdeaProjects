package DemoBanque;



public class DemoBanque {
    public static void main(String[] args) {
        Compte c1 =new Compte();
        Compte c2=new Compte();
        Compte c3=new Compte();

        System.out.println("valeur du premier compte");
        c1.init();

        System.out.println("valeur du deuxieme compte");
        c2.init();

        System.out.println("Valuer du troisieme compte");
        c3.init();

        System.out.println("operation sur compte"+c1.getNumero());
        c1.depot();

        System.out.println("operation sur compte"+c2.getNumero());
        c2.depot();

        System.out.println("Operation sur compte"+c3.getNumero());
        c3.depot();

        System.out.println("operation sur compte"+c1.getNumero());
        c1.retrait();

        System.out.println("operation sur compte"+c2.getNumero());
        c2.retrait();

        System.out.println("operation sur compte"+c3.getNumero());
        c3.retrait();

        System.out.println("sur le compte n' "+c1.getNumero()+" il ya "+c1.getSolde()+"euros");
        System.out.println("sur le compte n' "+c2.getNumero()+" il ya "+c2.getSolde()+"euros");
        System.out.println("sur le compte n' "+c3.getNumero()+" il ya "+c3.getSolde()+"euros");

    }
}

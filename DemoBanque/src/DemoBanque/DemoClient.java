package DemoBanque;

public class DemoClient {

    public static void main(String[] args) {
        Client c1 =new Client();
        c1.init();
        System.out.println(c1.getPrenom()+" "+c1.getNom()+" Habite à "+c1.getAdresse());
        c1.setAdresse("BXL");
        System.out.println(c1.getPrenom()+" "+c1.getNom()+" Habite à "+c1.getAdresse());
    }
}

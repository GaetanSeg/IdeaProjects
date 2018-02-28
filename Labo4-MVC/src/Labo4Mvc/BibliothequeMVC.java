package Labo4Mvc;

public class BibliothequeMVC {
    protected BibliothequeControleur bc;
    protected BibliothequeVue bv;
    protected BibliothequeModele bm;
    public BibliothequeMVC(String mode){

        this.bv=new BibliothequeVue();
        this.bc=new BibliothequeControleur();
        this.bm=new BibliothequeModele();
        switch(mode){
            case  "test" : bm.populate();

            case  "prod" :  bc.setBm(bm);
                bc.setBv(bv);
                break;
            default : System.out.println("mode incorrect");
                System.exit(1);// code d'erreur si !=0
        }

    }

    public void gestion(){
        bc.menu();
    }

    public static void main(String[] args){

        if(args.length!=1) {
            System.out.println("nombre d'arguments invalide");
            System.exit(1);//code d'erreur si !=0
        }
        BibliothequeMVC  bmvc=new BibliothequeMVC(args[0]);

        bmvc.gestion();
    }


}

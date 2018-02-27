/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package labo3;

/**
 *
 * @author Michel
 */
public class BiblioMVC {
  protected BiblioControleur bc;
    protected BiblioVue bv;
      protected BiblioModele bm;
  public BiblioMVC(String mode){
      
      this.bv=new BiblioVue();
      this.bc=new BiblioControleur();
      this.bm=new BiblioModele();
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
      BiblioMVC  bmvc=new BiblioMVC(args[0]);
  
      bmvc.gestion();
  }


}

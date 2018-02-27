/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package labo3;
/**
 *
 * @author Michel
 */
public class DemoVue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // démonstration simple des fonctionnalités de la vue
        
        String nom;
        BiblioVue bv = new BiblioVue();
        bv.affMsg("quel est votre nom ?");
        nom=bv.getMsg();
        bv.affMsg("Bonjour "+nom);
        String prenom;
        prenom=bv.getMsg("prenom ");
        bv.affMsg("bonjour "+prenom);

    }

}

package MarioGame;

import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {

    private  ImageIcon icoFond;
    private Image imgFond1;
    private Image imgFond2;

    private ImageIcon icoChateau1;
    private Image imgChateau1;

    private ImageIcon icoDepart;
    private Image imgDepart;

    private ImageIcon icoMario;
    private Image imgMario;

    private int xFond1;
    private int xFond2;

    private  int dx;

    //constructeur
    public Scene(){

        super();

        this.xFond1 = -50;
        this.xFond2 = 750;
        this.dx=0;
        icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
        this.imgFond1= this.icoFond.getImage();

        this.imgFond2= this.icoFond.getImage();

        icoMario= new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
        this.imgMario = this.icoMario.getImage();
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Clavier());

        Thread chronoEcran =  new Thread(new Chrono());
        chronoEcran.start();
    }
//getters

    public int getDx() { return dx; }

//Setters

    public void setDx(int dx) {this.dx = dx;}

    //Methodes

    public void deplacmentFond(){
        this.xFond1=this.xFond1 - this.dx;
        this.xFond2=this.xFond2 - this.dx;
//defilement gauche du background
        if (this.xFond1 == -800){ this.xFond1 = 800;

        }else if(this.xFond2 == -800){
            this.xFond2 = 800;
        }
//coter droit du defilement du background
        else if (this.xFond1 == 800){

            this.xFond1 = -800;

        }else if(this.xFond2 == 800){
            this.xFond2 = -800;
        }
    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;

        this.deplacmentFond();

        g2.drawImage(this.imgFond1,this.xFond1,0,null);
        g2.drawImage(this.imgFond2,this.xFond2,0,null);
        g2.drawImage(imgMario,300,245,null);



    }

}

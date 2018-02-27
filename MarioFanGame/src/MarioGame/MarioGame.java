package MarioGame;

import javax.swing.*;

public class MarioGame {

    public static Scene scene;
    public static void main(String[] args) {



        //creation d'une fenetre
        JFrame windows = new JFrame("MarioFanGame");
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setSize(700,360);
        windows.setLocationRelativeTo(null);
        windows.setResizable(false);
        windows.setAlwaysOnTop(true);
        //Instantiation de l'objet scene

        scene = new Scene();

        windows.setContentPane(scene);
        windows.setVisible(true);



    }
}

package MarioGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            MarioGame.scene.setDx(1);
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            MarioGame.scene.setDx(-1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        MarioGame.scene.setDx(0);
    }
}

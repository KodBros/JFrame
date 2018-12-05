package app3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.awt.Graphics;

public class App3 {

    public static void main(String[] args) {
        Pencere x = new Pencere();
        x.setSize(400, 250);
        x.setVisible(true);
        x.setLocation(400, 120);
    }
}

class Pencere extends JFrame implements KeyListener {

    String metin = "Bu yazıyı değiştirebilirsiniz...";

    Pencere() {
        super();        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(metin, 100, 100);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_BACK_SPACE && metin.length()>0) {            
            metin = metin.substring(0, metin.length() - 1);
            
        } else if (e.getKeyCode() == e.VK_ESCAPE) {
            System.exit(0);
        } else {
            metin += e.getKeyChar();            
        }        
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {        
    } 
    @Override
    public void keyReleased(KeyEvent e) {
    }    
}

package javaapplication2;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


public class app2 { 
    public static void main(String[] args) {
        Pencere x = new Pencere();
        x.setVisible(true);
        x.setSize(300,200);
    }
}

class Pencere extends JFrame implements MouseListener
{

    public Pencere() {
        addMouseListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
         this.setTitle("Pencere büyütüldü , konum değiştirildi.");
         this.setSize(500,400);
         this.setLocation(300,130);
    }
    @Override
    public void mousePressed(MouseEvent e) {  
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
}
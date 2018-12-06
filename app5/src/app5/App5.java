package app5;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import javax.swing.JFrame;

public class App5 {
    public static void main(String[] args) {
        pencere x = new pencere(0,0);
        x.setVisible(true);
        x.setSize(300, 300);
        x.setTitle("  Mouse nerde?"); 
    }
}
class pencere extends JFrame implements ActionListener,MouseListener{
    int x,y,a,b;
    Timer time = new Timer(70,this);
    
    pencere(int x,int y){
        super();
        time.start();
        addMouseListener(this);
        this.x=x;
        this.y=y;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //alttaki kod mouse simgesini (cursor'ı) ekranda gizlemeye yarıyor.
        //bunun dışındaki kodların benzerlerini önceki uygulamalarda yazdık zaten :) 
        this.setCursor(this.getToolkit().createCustomCursor
           (new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB)
                                       ,new Point(0, 0),"null"));
    }
    @Override
    public void paint(Graphics g){
         super.paint(g);
         g.drawOval(a, b, x, y);
         g.drawString("Görmek için ekrana Tıkla", 70, 45);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x==y && x<22) {
            x+=10;
            y+=10;    
        } 
        repaint(); 
    }

    @Override
    public void mouseClicked(MouseEvent e) { 
        this.a = e.getX()-(this.x/2);
        this.b = e.getY()-(this.y/2); 
        this.x=0;
        this.y=0;
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
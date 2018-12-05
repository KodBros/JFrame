package app1;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class bizimPencere extends JFrame{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(120, 100, 250, 200);
        g.drawRect(185, 150, 125, 100);
        g.drawLine(120, 100, 370, 300);
    }
}
class bizimPencere2 extends JFrame{
    Random r;
    public bizimPencere2(){
        super();
        r = new Random();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        for (int i = 0; i < 10; i++) {
            g.drawLine(r.nextInt(120), r.nextInt(100), r.nextInt(370), r.nextInt(300)); 
        }
    }
}
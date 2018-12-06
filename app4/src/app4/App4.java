package app4; 
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class App4 { 
    public static void main(String[] args) {
        pencere x = new pencere(60);
        x.setVisible(true);
        x.setSize(400,400); 
    }   
}

class pencere extends JFrame implements ActionListener{
    int x ,y;
    Timer zaman = new Timer(50, this);
    
    pencere(int x){
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.x=x;  
        zaman.start();
    }  
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(x, 150, 100, 100); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x+=25; 
        if (x>320) {
            x=0; 
        }
        repaint();
    }
}

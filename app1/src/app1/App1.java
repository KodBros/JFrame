package app1;

public class App1 {
    public static void main(String[] args) {
        bizimPencere pencere = new bizimPencere();
        pencere.setSize(500,400);
        pencere.setVisible(true); 
        pencere.setLocation(170, 150);
        pencere.setTitle("Dikdörtgen Çizme");
        bizimPencere2 pencere2 = new bizimPencere2();
        pencere2.setSize(500,400);
        pencere2.setVisible(true);
        pencere2.setLocation(670, 150);
        pencere2.setTitle("Rastgele Çizgi Çizme");
    } 
} 
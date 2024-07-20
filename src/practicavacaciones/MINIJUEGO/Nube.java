package practicavacaciones.MINIJUEGO;

import java.awt.Graphics2D;

public class Nube {
    
    int diametro = 20;
    int diametro2 = 40;
    int x = 700;
    int y = 100;
    
    private Juego jueguito;
    
    public Nube(Juego jueguito) {
        this.jueguito = jueguito;
    }
    
    public void mover() {
        x = x - 1;
        if(x == -50) {
            x = 700;
        }
    }
    
    public void paint(Graphics2D g) {
        g.fillOval(x, y, diametro, diametro);
        g.fillOval(x + 15, y - 15, diametro2, diametro2);
        g.fillOval(x + 50, y, diametro, diametro);
    }
}
package practicavacaciones.MINIJUEGO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.awt.Graphics;       

public class Juego extends JPanel {
    
    Personaje personaje1 = new Personaje(this);
    Obstaculo obstaculo1 = new Obstaculo(this);
    Nube nubecita = new Nube(this);

    // variables para el juego
    public boolean juegoFinalizado = false;
    public int puntos = 0;

    public Juego() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje1.KeyPressed(e);
            }
        });

        setFocusable(true);
    }
    
    void mover() {
        personaje1.mover();
        obstaculo1.mover();
        nubecita.mover();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);
    }
    
    public void dibujar(Graphics2D g) {
        g.setColor(Color.BLUE);
        nubecita.paint(g);
        
        g.setColor(Color.BLACK);
        personaje1.paint(g);
        
        g.setColor(Color.RED);
        obstaculo1.paint(g);
        
        mover();
    }
    
    public void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);
        g.setColor(Color.MAGENTA);
        g1.drawString("Puntaje: " + puntos, 510, 30);
        
        if(juegoFinalizado) {
            g2.setColor(Color.RED);
            g2.drawString("!! Haz perdido !! ", (float) getBounds().getCenterX() / 2 + 50, 70);
        }
    }
    
    public void finjuego() {
        juegoFinalizado = true;
    }
}
package practicavacaciones.MINIJUEGO;


import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author royum
 */
public class Personaje {
    
    int ancho = 50;
    int alto = 50;
    int x = 50;
    int y = 200;
    int x1 = 0;
    int y1 = 0;
    
    private Juego jueguito;
    
    boolean saltando = false;
    boolean sube = false;
    boolean baja = false;
    
    public Personaje(Juego jueguito){
        this.jueguito = jueguito;
    }
    
    public void mover(){
        if(x + x1 > 0 && x + x1 < jueguito.getWidth() - ancho)
            x = x + x1;
        
        if(saltando)
        {
            if(y == 200) // personaje esta en el suelo
            {sube = true;
            y1 = -5;
            baja = false;}
            if(y == 90) // personaje llega al limite de salto
            {baja = true;
            y1 = 5;
            sube = false;
            }
            
            if(sube)
            {
                y = y + y1;
            }
            if(baja)
                {
                    y = y + y1;
                    if(y == 200)
                    {
                        saltando = false;
                    }
                }
        }
    }
    
    public void paint (Graphics2D g){
        g.fillRect(x, y, ancho, alto);
    }
     
    public void KeyPressed(KeyEvent e){
        
        if(e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            saltando = true;
        }
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x+5, y+y1, ancho, alto);
    }
    
}

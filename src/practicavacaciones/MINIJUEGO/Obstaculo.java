package practicavacaciones.MINIJUEGO;


import java.awt.Graphics2D;
import java.awt.Rectangle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author royum
 */
public class Obstaculo {
    
    int ancho = 20;
    int alto = 50;
    int x = 700;
    int y = 200;
    int x1 = -5;
   
    private Juego jueguito;
    
    public Obstaculo (Juego jueguito){
        this.jueguito = jueguito;
    }
    
    void mover(){
        
        if(x<=-50 )
        {
            jueguito.puntos++;
            x=700;
        } else
            {
            
                if(colision())
                {
                    jueguito.finjuego();
                } else {
                    x = x + x1;
                }    
            }
    }
    
    private boolean colision(){
        return jueguito.personaje1.getBounds().intersects(getBounds());
    }
    
    public void paint (Graphics2D g){
        g.fillRect(x, y, ancho, alto);
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,ancho,alto);
    }
    
}

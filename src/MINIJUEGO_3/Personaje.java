/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MINIJUEGO_3;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author royum
 */
public class Personaje {
    
    static final int Ancho = 100;
    static final int Alto = 100;
    int x = 50;
    static int y = 250;
    
    int y1 = 0;
    
    Juego jueguito;
    static boolean saltando = false;
    boolean sube = false;
    boolean baja = false;
    
    public Personaje(Juego jueguito){
        this.jueguito = jueguito;
    }
    
    public void mover(){
        if(saltando){
            if(y == 250){ // el personaje esta en el suelo
                sube = true;
                y1 = -5;
                baja = false;
            }
            if(y == 50){ // el personaje llego al limite del salto
                baja = true;
                y1 = 5;
                sube = false;
            }
            if(sube){
                y += y1;
            }
            if(baja){
                y += y1;
                if(y == 250){
                    saltando = false;
                }
            }
            
        }
    }
    
    public void paint (Graphics2D g){
        g.fillRect(x, y, Ancho, Alto);
    }

    public void keyPressed(KeyEvent e){
        // personaje salta con la tecla Espacio
        
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            saltando = true;
        }
    }
    
    public Rectangle getBounds(){
        return new Rectangle (x,y, Ancho, Alto);
    }
    
}

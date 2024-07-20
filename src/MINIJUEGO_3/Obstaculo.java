/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MINIJUEGO_3;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author royum
 */
public class Obstaculo {
    
    static final int Ancho = 50;
    static final int Altura = 100;
    static int inc_x = -5;
    static int x = 1200;
    int y = 250;
    
    Juego jueguito;
    
    public Obstaculo (Juego jueguito){
        this.jueguito = jueguito;
    }
    
    public void mover(){
        if(x<=-50){
            jueguito.puntos++;
            x = 1200;
            if(jueguito.puntos == 3 | jueguito.puntos == 6 | jueguito.puntos == 9 | jueguito.puntos == 12 | jueguito.puntos == 15){
                inc_x += -2;
                jueguito.nivel++;
            }
        } else{
            if(colision()){
                if(jueguito.vidas == 0){
                    jueguito.finJuego();
                } else{
                    jueguito.pierdeVida();
                }
            } else{
                x+=inc_x;
            }
        }
    }
    
    public boolean colision(){
        return jueguito.personaje1.getBounds().intersects(getBounds());
    }
    
    public void paint (Graphics2D g){
        g.fillRect(x, y, Ancho, Altura);
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x-5, y, Ancho,Altura);
    }

  
    
}

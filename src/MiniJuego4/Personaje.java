/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJuego4;

import java.awt.Color;
import java.awt.Graphics;
// se utiliza para manejar eventos de teclado en aplicaciones gráficas. 
//Esta librería permite a los desarrolladores capturar y responder a la entrada del teclado, como presionar, soltar y teclear teclas específicas. 
import java.awt.event.KeyEvent;

/**
 *
 * @author royum
 */
public class Personaje {
    Laberinto lab = new Laberinto();
    
    int x = 40;
    int y = 40;
    int ancho = 40;
    int alto  = 40;
    int movimiento  = 40;
    
    public void paint(Graphics grafico){
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.black);
        grafico.drawOval(x, y, ancho, alto);
        
        // ojos personaje
        grafico.setColor(Color.white);
        grafico.fillOval(x+7, y+8, 13, 13);
        grafico.fillOval(x+21, y+8, 13, 13);
        grafico.setColor(Color.black);
        grafico.fillOval(x+11, y+12, 5, 5);
        grafico.fillOval(x+25, y+12, 5, 5);
        
        // boca personaje
        grafico.setColor(Color.black);
        grafico.fillOval(x+7, y+24, 27, 7);
    }
    
    public void teclaPresionada(KeyEvent evento){
        // uso de matriz 
        
        int [][] laberinto = lab.obtieneLaberinto();
        
        //uso de Keycode 
        // este permite permite a las aplicaciones Java detectar y responder a eventos de teclado de manera precisa.
        // sirve para mover un objeto en la pantalla cuando se presionan las teclas de flecha. 
        
        // estos numeros corresponden a los códigos de las teclas de dirección (flechas) en un teclado estándar. 
        
        // Estos valores provienen del estándar de códigos ASCII extendidos para teclas de función y navegación. 
        // Cuando se detecta que una tecla ha sido presionada, se puede usar el método getKeyCode() para obtener el código de la tecla y luego comparar ese código con los valores conocidos para determinar qué acción realizar. 
        
        if(evento.getKeyCode() == 37){ // izquierda
            if(laberinto[y/40][(x/40)-1]!=1){
                x= x-movimiento;
            }
        }
        if(evento.getKeyCode() == 39){ // derecha 
             if(laberinto[y/40][(x/40)+1]!=1){
                x= x+movimiento;
            }
        }
        if(evento.getKeyCode() == 40){ // abajo
            if(laberinto[(y/40)+1][x/40]!=1){
                y= y+movimiento;
            }
        }
        if(evento.getKeyCode() == 38){ // arriba
             if(laberinto[(y/40)-1][x/40]!=1){
                y= y-movimiento;
            }
        }
        
        if(x == 840 && y == 440){
            Juego.cambiaNivel();
            x = 40;
            y = 40;
        }
    }
    
}

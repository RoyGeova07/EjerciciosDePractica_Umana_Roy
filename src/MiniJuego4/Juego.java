/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJuego4;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author royum
 */
public class Juego extends JPanel{
    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();
    public static int nivel =1;
    
    public Juego(){
        
        // esto sirve para recibir eventos del teclado
        addKeyListener(new KeyListener(){ 
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
    });
        setFocusable(true);
        
    }
    

    
    public void paint (Graphics grafico){
        laberinto.paint(grafico);
        personaje.paint(grafico);
    }
    
    public static int cambiaNivel(){
        return nivel++;
    }
    
    public static int obtieneNivel(){
        return nivel;
    }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Estas Listo?");
        JFrame miVentana = new JFrame ("Juego Laberinto");
        Juego game = new Juego();
        miVentana.add(game);
        miVentana.setSize(920, 540);
        miVentana.setLocation(300, 200);
        miVentana.setVisible(true);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        // uso de hilo xddd 
        // Thread.sleep(10): Este método hace que el hilo actual duerma (pausa su ejecución) durante un periodo de tiempo especificado, en este caso, 10 milisegundos.
        // Esto es util para controlar la velocidad de ejecución del bucle, previniendo que se ejecute demasiado rapido y consuma innecesariamente recursos de la CPU.
        
        // catch (InterruptedException ex):Thread.sleep(10) puede lanzar una InterruptedException si otro hilo interrumpe el hilo actual mientras esta dormido.
        // En este caso, el bloque catch captura la excepción y registra un mensaje de error utilizando el Logger.
        
        // Importancia del Thread.sleep 
        //Control de Velocidad: Sin Thread.sleep(10), el bucle se ejecutaria lo mas rapido posible, consumiendo demasiados recursos de CPU y haciendo que el juego sea incontrolable.
        // Sincronizacion: Ayuda a sincronizar la logica del juego y el redibujado, proporcionando una experiencia de usuario mss suave y consistente.
        
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         
            // no poner game.repaint...
            
            miVentana.repaint();
            
            // condicion
            if(obtieneNivel()>4){
                JOptionPane.showMessageDialog(null, "Bye gei");
                // salida xd
                System.exit(0);
            }
        }
    }
    
}

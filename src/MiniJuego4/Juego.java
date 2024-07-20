/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJuego4;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
// se utiliza para recibir eventos de teclado, como presionar, soltar y teclear teclas específicas. 
// Implementando esta interfaz, puedes definir cómo debe reaccionar tu aplicación a diferentes eventos de teclado.
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
    
    // proposito de .paint:  es permitir a los desarrolladores personalizar cómo se dibujan los componentes gráficos en la pantalla.
    // Propósito de paintComponent(Graphics g): en el personalizado: Permite a los desarrolladores definir exactamente cómo se dibujan los componentes. Esto incluye dibujar formas, texto, imágenes, y más.
    // cuando es con la actulizacion visual se llama automáticamente cuando el componente necesita ser redibujado, como cuando se redimensiona la ventana, se oculta y luego se muestra de nuevo, o cuando se invoca el método repaint().
    
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
        // Esto es útil para controlar la velocidad de ejecución del bucle, previniendo que se ejecute demasiado rápido y consuma innecesariamente recursos de la CPU.
        
        // catch (InterruptedException ex):Thread.sleep(10) puede lanzar una InterruptedException si otro hilo interrumpe el hilo actual mientras está dormido.
        // En este caso, el bloque catch captura la excepción y registra un mensaje de error utilizando el Logger.
        
        // Importancia del Thread.sleep 
        //Control de Velocidad: Sin Thread.sleep(10), el bucle se ejecutaría lo más rápido posible, consumiendo demasiados recursos de CPU y haciendo que el juego sea incontrolable.
        // Sincronización: Ayuda a sincronizar la lógica del juego y el redibujado, proporcionando una experiencia de usuario más suave y consistente.
        
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // se utiliza comúnmente en aplicaciones gráficas y juegos para solicitar la actualización 
            // (redibujado) de un componente. Cuando llamas a repaint(), le estás diciendo al sistema de la interfaz 
            //gráfica de usuario (GUI) que ese componente necesita ser redibujado.
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

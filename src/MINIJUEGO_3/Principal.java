/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MINIJUEGO_3;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author royum
 */
public class Principal {

    public static int reiniciarJuego = -1;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Estas listo? ");
        JFrame ventana = new JFrame("Simple Juego");
        Juego jueguito = new Juego();
        ventana.add(jueguito);
        ventana.setSize(1200, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {

            if (jueguito.JuegoFinalizado) {
                reiniciarJuego = JOptionPane.showConfirmDialog(null, "Haz perdido, Quieres reiniciar el juego?", "Haz perdido", JOptionPane.YES_NO_OPTION);
                if(reiniciarJuego == 0){
                    jueguito.JuegoFinalizado = false;
                    Obstaculo.inc_x = -5;
                    Obstaculo.x = 1200;
                    jueguito.puntos = 0;
                    jueguito.nivel = 1;
                    jueguito.vidas = -1;
                } else if(reiniciarJuego == 1){
                    System.exit(0);
                }
            } else {

                jueguito.repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(jueguito.pierdeVida){
                    JOptionPane.showMessageDialog(null, "CUIDADO PERDISTE 1 VIDA!!");
                    jueguito.pierdeVida = false;
                    jueguito.vidas--;   
                    Obstaculo.x=1200;
                    Personaje.saltando = false;
                    Personaje.y = 250;
                    
                }

            }

        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author royum
 */
public class SerpienteInfinita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int posActual = 15;
        int anchoMaximo = 30;
        
        boolean primeravez = true;
        
        while(true){
            
            try {
                Thread.sleep(200);
                
                 for(int iteracion = 0; iteracion <= anchoMaximo; iteracion++){
                
                // lo que primero imprima sea la cabesza de la serpiente
                if(iteracion == posActual){
                    if(primeravez){
                        System.out.print("@");
                        primeravez = false;
                    } else {
                        System.out.print(" |<>| ");
                    }
                    
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
            // codigo para que se vaya moviendo de lado a lado
            posActual +=(int) (Math.random()*3)-1;  // numero aleatorio de 0 y 2    generara(-1 y 1)
            if(posActual == -1)/* este dice que a llegado demasiado a la derecha*/ posActual = 0; // para que quede visible en la pantalla 
            if(posActual == 31) posActual = 30;
                
            } catch (InterruptedException ex) {
                Logger.getLogger(SerpienteInfinita.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
                              

        }
        
    }
    
}

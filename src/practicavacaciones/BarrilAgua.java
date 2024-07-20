/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author royum
 */
public class BarrilAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int capacidad = 0, agua;
        //constante
        final int Ancho = 6;
        Random rand = new Random();
        
        do{
            
            try{
                
                capacidad = Integer.parseInt(JOptionPane.showInputDialog("Dime la capacidad del Barril. \n Minimo 1."));
                
            } catch(NumberFormatException e){
                
                System.out.println("Un numero por favor, No seas Imbecil.");
                
            }
            
        }while(capacidad == 0);
        
        // este generara un numero aleatorio entre 0 y 7.
        agua = rand.nextInt(capacidad +1);
        
        System.out.println("Capacidad = " + capacidad + " Agua = " + agua);
        
        //iguala a la capacidad porque esta va a hacer la altura del barril.
        // Mayor igual a cero porque quiero que haya una ultima linea que va hacer el suelo del barril, osea el suelo no tiene que llenarse de agua
        for(int iteracion = capacidad; iteracion >= 0; iteracion--){
            for(int anch = Ancho; anch > 0; anch-- ){
                
                // igual igual a 0, osea quiere decir que hemos llegado abajo 
                if(iteracion == 0) System.out.print("*");
                // tenemos que comprobar si estamos en la columna de la izquierda o de la derecha al final de barril
                else{
                    //si llega a cero ya sale del bucle
                    if(anch == Ancho || anch==1) System.out.print("*");
                    // ahora pueden pasar 2 cosas 
                    // que ese nivel de barril este vacio o tenga agua
                    else{
                        if(iteracion <= agua) System.out.print("="); // el "=" es el agua
                        else System.out.print(" "); // el " " es lo vacio del barril
                    }
                }
            }
            System.out.println();
        }
        
    }
    
}

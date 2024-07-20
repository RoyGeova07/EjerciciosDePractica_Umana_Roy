/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Dibujar un cuadro con asteristicos dada con la longitud de sus lados 
(la longitud ira para todos lados )
ejemplo :
el usuario ingreso el 5 se debe mostrar lo siguiente

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/


/**
 *
 * @author royum
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        int longitud;
        
        System.out.println("Ingrese la longitud del cuadro: ");
        longitud = lea.nextInt();
        
        for(int iteracion = 1; iteracion <=  longitud; iteracion++){
            for (int mesa = 1; mesa <= longitud; mesa++){
                System.out.print(" * ");
                
            }
            System.out.println();
        }
        
    }
    
}

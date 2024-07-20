/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Multiplo_2_y_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Ingrese un numero");
        numero = lea.nextInt();
        
        if(((numero % 2 ) ==0) && ((numero % 3) == 0)){
            System.out.println("El numero es multiplo de 2 y 3");
        } else {
            System.out.println("El numero no es multiplo de 2 y 3");
        }
    }
    
}

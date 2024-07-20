/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Diseniar un algoritmo que permita ingresar cualquier numero mayor que cero y menor que diez, y luego el algoritmo
debe calcular los multiplos menores que 100 del numero ingresado.
*/

/**
 *
 * @author royum
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        int numero;
        
        do{
        System.out.println("Ingresar un numero: ");
        numero = lea.nextInt();
        
        if(numero > 0 && numero < 10){
            for(int mesero = 0; mesero <= 100; mesero++){
                if(mesero % numero == 0 ){
                    System.out.println("Multiplo: "+mesero);
                }
            }
        } else {
            System.out.println("Ingrese un numero mayor que o menor que 1: ");
        }
        
        } while(numero > 0 || numero < 10 );
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Desarrolle un programa que determine el mayor numero de 3 numeros ingresados por teclado. Si los numeros ingresados
son iguales mostrar por pantalla eso.
*/

/**
 *
 * @author royum
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int numero = lea.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = lea.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero3 = lea.nextInt();
        
        if(numero > numero2 && numero > numero3){
            System.out.println("El numero  "+numero+ " es mayor.");
        } else if(numero2 > numero && numero2 > numero3){
            System.out.println("El numero "+numero+ " es mayor.");
        } else if(numero3 > numero && numero3 > numero2){
            System.out.println("El numero "+numero+ " es mayor");
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Hacer un programa que lea 2 numeros y deducir si estan en orden crecient o decreciente.
    
Preguntar al usuario si desea continuar (y/B) el proceso se repetira si la opcion es y;
 */
/**
 *
 * @author royum
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        String opcion;

        do {
            System.out.println("Ingrese un numero: ");
            int numero = lea.nextInt();
            System.out.println("Ingrese un numero: ");
            int numero2 = lea.nextInt();

            if (numero > numero2) {
                System.out.println("Los numeros estan en forma decreciente ");
            } else {
                System.out.println("Los numeros estan en forma creciente");
            }

            System.out.println("Desea continuar? y/n");
            opcion = lea.next();

        } while (opcion.equalsIgnoreCase("n"));

    }

}

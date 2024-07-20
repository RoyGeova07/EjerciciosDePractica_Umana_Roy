/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Escribe un programa que pida al usuario dos numeros, determinar cual es el mayor y cual es el menor o si son iguales
 */
/**
 *
 * @author royum
 */
public class MENOR_O_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int numero, numero2;

        System.out.println("Ingrese un numero: ");
        numero = lea.nextInt();
        System.out.println("Ingrese otro numero");
        numero2 = lea.nextInt();

        if (numero > numero2) {
            System.out.println("El numero: " + numero + " es mayor que " + numero2);
        } else if (numero < numero2) {
            System.out.println("El numero: " + numero + " es menor que " + numero2);
        } else {
            System.out.println("El numero: " + numero + " es igual a " + numero2);
        }

    }

}

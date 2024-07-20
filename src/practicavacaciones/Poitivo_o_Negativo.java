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
public class Poitivo_o_Negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero");
        numero = lea.nextInt();

        if (numero < 0) {
            System.out.println("El numero que ingreso fue: " + numero + " es negativo");
        } else {
            System.out.println("El numero que ingreso fue: " + numero + " es positivo");
        }

    }

}

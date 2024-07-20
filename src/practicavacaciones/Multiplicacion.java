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
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int numero1, numero2;
        int producto = 0;

        System.out.println("Ingrese el primer numero: ");
        numero1 = lea.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = lea.nextInt();

        System.out.println(numero1 + "x" + numero2);

        int iteracion = 0;

        while (iteracion < numero2) {
            producto += numero1;
            iteracion++;

        }

        System.out.println("TOTAL: " + producto);

    }

}

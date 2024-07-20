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
public class TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de altura del triangulo: ");
        int altura = lea.nextInt();

        for (int arriba = 1; arriba <= altura; arriba++) {
            System.out.println();
            for (int abajo = 1; abajo <= arriba; abajo++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int arriba = 1; arriba <= altura; arriba++) {
            System.out.println();
            for (int abajo = 1; abajo <= altura - arriba; abajo++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}

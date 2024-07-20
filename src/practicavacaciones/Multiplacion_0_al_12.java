/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Escribe un programa que solicite al usuario un numero y luego imprima la tabla de multiplicar  de ese numero del
0 al 12.
 */
/**
 *
 * @author royum
 */
public class Multiplacion_0_al_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int numero1;

        System.out.println("Ingrese un numero a multiplicar de 0 al 12: ");
        numero1 = lea.nextInt();

        for (int iteracion = 0; iteracion <= 12; iteracion++) {
            System.out.println(numero1 + "x" + iteracion + " = " + (numero1 * iteracion));
        }
    }

}

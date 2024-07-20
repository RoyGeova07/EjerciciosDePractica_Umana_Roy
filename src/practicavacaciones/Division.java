/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Hacer un programa que permita leer 2 numeros  y divida sin usar "/"
 */
/**
 *
 * @author royum
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int numero1, numero2;
        int residuo = 0;
        int cociente = 0;

        System.out.println("Ingrese un numero: ");
        numero1 = lea.nextInt();
        System.out.println("Ingrese otro numero");;
        numero2 = lea.nextInt();

        System.out.println(numero1 + "/" + numero2);

        while (numero1 >= numero2) {
            cociente++;
            residuo = numero1 - numero2;
            numero1 = numero1 - numero2;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

    }

}

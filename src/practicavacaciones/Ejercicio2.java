/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;
import java.util.*;

/*
* Escribe un programa que muestre por consola los numeros de 1 a 100 (ambos incluidos y con un salto de linea 
* entre cada impresion), sustituyendo los siguientes: 
* - Multiplos de 3 por la palabra "fizz".
* - Multiplos de 5 por la palabra "buzz".
* - Multiplos de 3 y 5 a la vez por la palabra "fizzbuzz."
 */
/**
 *
 * @author royum
 */
public class Ejercicio2 {

    static Scanner lea = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int iteracion = 1; iteracion <= 100; iteracion++) {
            // multiplos de 3 y 5 imprimimos fizzbuzz
            if (((iteracion % 3) == 0) && ((iteracion % 5) == 0)) {
                System.out.println(iteracion + ": fizbuzz");

            } else if ((iteracion % 3) == 0) {
                // multiplos de 3
                System.out.println(iteracion + ": fizz");
            } else if ((iteracion % 5) == 0) {
                // multiplos de 5
                System.out.println(iteracion + ": buzz");
            }

        }

    }

}

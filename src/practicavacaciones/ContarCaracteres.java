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
public class ContarCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        String texto;
        System.out.println("Ingrese una cadena de texto");
        texto = lea.nextLine().toLowerCase();

        // inicializamos un array contras las letras (solo las letras minusculas).
        int[] contadorLetras = new int[26];

        for (int contar = 0; contar < texto.length(); contar++) {
            char caracter = texto.charAt(contar);
            if (caracter >= 'a' && caracter <= 'z') {
                contadorLetras[caracter - 'a']++;
            }
        }

        for (int ite = 0; ite < contadorLetras.length; ite++) {

            if (contadorLetras[ite] > 0) {
                System.out.println((char) (ite + 'a') + " : " + contadorLetras[ite]);
            }

        }

    }

}

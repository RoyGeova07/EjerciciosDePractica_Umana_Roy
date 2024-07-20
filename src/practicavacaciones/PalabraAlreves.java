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
public class PalabraAlreves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        String palabra;
        do {

            System.out.println("\n");
            System.out.println("Ingrese una palabra para invertirla:      (presione 1 para finalizar  programa)");
            // lee la palabra 
            palabra = lea.nextLine();

            if (palabra.equals("1")) {
                break;
            }

            //Variable que alamacena 
            String palabraAlReves = "";

            int longitud = palabra.length();

            //Inicializador un contador con la longitud  de la palabra menos 1
            int contador = longitud - 1;

            // El contador sea mayor o igual a 0
            while (contador >= 0) {

                // Concatenar el caracter en la posicion indicada por el contador al String PalabraAlReves
                palabraAlReves += palabra.charAt(contador);
                // Decrementar el contador para ir recorriendo la palabra de atras hacia adelante
                contador--;
            }
            // Imprime el contador 
            System.out.println("La palabra invertida es: " + palabraAlReves);

        } while (true);

    }

}

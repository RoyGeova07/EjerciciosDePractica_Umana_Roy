/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Escribe un programa que pida al usuario una cantidad  de  numeros, el programa debe finalizar cuando se escribe el
numero 0 

se debe mostrar cuantos numeros han sido ingresados, cantidad de numeros pares, impares, positivos, negativos y
la suma total de todos los numeros ingresados, todo por separado. no debe incluir el numero 0 para ninguno de los
casos.
 */
/**
 *
 * @author royum
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int numero, numero2;
        int numerospares = 0, numerosimpares = 0, numerospositivos = 0, numerosnegativos = 0;
        int sumanumeros = 0, cantidadNumeros = 0;

        do {
            System.out.println("Ingrese un numero, dando enter para ingresar mas datos y ingrese (0) para mostrar el resultado programa");
            numero = lea.nextInt();

            if (numero != 0) {
                sumanumeros += numero;
                cantidadNumeros++;
                if (numero > 0) {
                    numerospositivos++;
                } else {
                    numerosnegativos++;
                }

                if ((numero % 2) == 0) {
                    numerospares++;
                } else {
                    numerosimpares++;
                }
            }
        } while (numero != 0);

        System.out.println("");
        System.out.println("Numeros Ingresados: " + cantidadNumeros);
        System.out.println("Numeros pares: " + numerospares);
        System.out.println("Numeros impares: " + numerosimpares);
        System.out.println("Numeros Negativos: " + numerosnegativos);
        System.out.println("Numeros positivos: " + numerospositivos);
        System.out.println("Suma total de todos los numeros ingresados: " + sumanumeros);
    }

}

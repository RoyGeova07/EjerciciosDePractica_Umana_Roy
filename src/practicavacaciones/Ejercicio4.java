/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Ingresar 2 numeros desde el teclado (a,b) y hacer las siguientes operaciones segun el caso: a. sumar los numeros
si estos son pares.
b. restar a-b, si estos son impares 
c. multiplicar a*b, si es un numero par y el otro impar 
d. dividir a/b, si es numero impar y el otro par

pedir al usuario si desea continuar con (y o si) (n o no)

el proceso se repetira mientras la opcion sea si
 */
/**
 *
 * @author royum
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int numeroa, numerob, suma, resta, multiplicacion, division;
        String opcion;

        do {

            //aqui pedimos los numeros
            System.out.println("Ingresar el primer numero: ");
            numeroa = lea.nextInt();
            System.out.println("Ingrese el  segundo numero: ");
            numerob = lea.nextInt();

            // condicion si ambos son pares 
            if (((numeroa % 2) == 0) && ((numerob % 2) == 0)) {
                suma = numeroa + numerob;
                System.out.println("La suma es: " + suma);

                // condicion si no los 2 son impares
            } else if (((numeroa % 2) != 0) && ((numerob % 2) != 0)) {
                resta = numeroa - numerob;
                System.out.println("La resta es: " + resta);

                // condicion si 1 de los 2 es impar o par
            } else if (((numeroa % 2) == 0) && ((numerob % 2) != 0)) {
                multiplicacion = numeroa * numerob;
                System.out.println("La multiplicacion es: " + multiplicacion);

                // condicion dividir 
            } else if (((numeroa % 2) != 0) && ((numerob % 2) == 0)) {
                division = numeroa / numerob;
                System.out.println("La division es: " + division);
            }

            // preguntamos si desea continuar 
            System.out.println("Desea continuar?  Y/N ");
            opcion = lea.next();

            // mientras la opcion sea Y 
        } while (opcion.equalsIgnoreCase("Y"));
        System.out.println("Gracias por usar el programa adios!!!");

    }

}

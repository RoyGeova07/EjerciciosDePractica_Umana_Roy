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
public class Par_O_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.println("Bienvenido!!!,  este programa determinara si el numero que usted ingrese es par o impar ");
        System.out.println("\n");
        
        int numero;
        
        System.out.println("Ingrese un numero");
        numero = lea.nextInt();
        
        String resutado = numero % 2 == 0 ? "par" : "impar";
        
        System.out.println("El numero que usted ingrese fue: "+numero+ " y ese numero es "+resutado);
    }

}

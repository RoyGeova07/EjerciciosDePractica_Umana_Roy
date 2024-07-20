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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        double suma,resta,multiplicacion,division;
        double numero1, numero2;
        int opcion = 0;
        
        System.out.println("Bienvenido Usuario a la calculadora de Roys donde puedes sumar, restar, multiplicar y dividir");
        System.out.println("\n");
        
        System.out.println("Ingrese primer numero: ");
        numero1 = lea.nextDouble();
        System.out.println("Ingrese segundo numero: ");
        numero2 = lea.nextDouble();
        System.out.println("\n");
        
        while(opcion !=5){
            System.out.println("\n");
            System.out.println("Opciones.");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Terminar el programa...");
            System.out.println("Ingrese una opcion: ");
            opcion = lea.nextInt();

            if(opcion < 1 || opcion > 5){
                System.out.println("ERROR: EL NUMERO SELECCIONADO NO ESTA ENTRE LAS OPCIONES, VUELVA SELECCIONAR UNA OPCION VALIDA");
                continue;
            }
            
            if(opcion == 1){
                suma = numero1 + numero2;
                System.out.println("Suma entre el "+numero1+ " + "+numero2+ " = " +suma);
                continue;
                        
            }
            
            if(opcion == 2){
                resta = numero1 - numero2;
                System.out.println("Resta entre el "+numero1+ " + " +numero2+ " = "+resta);
          
            }
            
            if(opcion == 3){
                division = numero1 / numero2;
                System.out.println("division entre el "+numero1+ " + " +numero2+ " = "+division);
                
            }
            
            if(opcion == 4){
                multiplicacion = numero1*numero2;
                System.out.println("multiplicacion entre el "+numero1+ " + " +numero2+ " = "+multiplicacion);
                
                
            }
            if(opcion == 5){
                System.out.println("Fin del programa, Gracias por usar la calculadora de Roys.");
            }
        }

        
    }
    
}

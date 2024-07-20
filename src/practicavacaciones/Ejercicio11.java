/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Elabora un algoritmo que permita ingresa 20 numeros y muestre la canitdad de numeros son menores o iguales a 25
*/

/**
 *
 * @author royum
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int contador = 0, CantidadElementos = 20;
        int arreglo[] = new int[CantidadElementos];
        
        //datos
        
        System.out.println("Ingrese datos al arreglo");
        for(int guardar = 0; guardar < CantidadElementos; guardar++){
            System.out.println((guardar + 1)+"  Ingrese un elemento: ");
            arreglo[guardar] = lea.nextInt();
            
            // evaluamos cada numero segun la condicion 
            if(arreglo[guardar] <= 25){
                contador++;
            }
        }
        
        // mostramos los datos del arreglo 
        System.out.println("Datos del arreglo ");
        for(int queso  = 0; queso < CantidadElementos; queso++){
            System.out.println("["+arreglo[queso]+ "]" );
        }
        System.out.println("\n Cantidad de numeros menores o iguales a 25: "+contador);
        
    }
    
}

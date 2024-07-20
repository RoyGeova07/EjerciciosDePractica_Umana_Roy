/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*Dado un numero 'N' por teclado mostrar la suma desde el 0  hasta 'n', el algoritmo finalizado cuando ingresa
un 0.
*/



/**
 *
 * @author royum
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int numero, suma;
        
        
        /*
        con un ciclo do while pedimos el numero 
        este se detendra cuando ingrese un 0
        */
        
        do{
            suma = 0;
            
            System.out.println("Ingrese un numero,    (dale 0 para finalizar)");
            numero = lea.nextInt();
            
            // si es diferente de cero procede 
            if(numero !=0){
                for(int iteracion = 0; iteracion <= numero; iteracion++){
                    suma = suma + iteracion;
                }
                System.out.println("La suma desde el 0 hasta "+numero+ ", es : " +suma);
            }
        } while(numero !=0);
    }
    
}

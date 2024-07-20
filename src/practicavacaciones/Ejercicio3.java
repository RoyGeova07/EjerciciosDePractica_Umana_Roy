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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea  = new Scanner (System.in);
        
        int primerdigito, ultimodigito, sumadigito, numero;
        
        
        // con un ciclo  do while iremos pidiendo el numero y a la ves mostrando 
        // la suma de su primera y ultima cifra.
        
        do{
            System.out.println("Ingrese el numero de cuatro cifras.");
            numero = lea.nextInt();
            
            // evaluamos que sea de 4 cifras y de diferente  de 0
            
            if((numero < 9999) &&  (numero > 999) &&  (numero != 0)){
                // sacamos el primer digito 
                
                primerdigito = (numero / 100);
                ultimodigito = (numero  % 10 );
                sumadigito = primerdigito + ultimodigito;
                System.out.println("Primer digito: "+primerdigito);
                System.out.println("Ultimo digitos: "+ultimodigito);
                System.out.println("Suma digitos: "+sumadigito);
            } 
        } while (numero != 0);
    }
    
}

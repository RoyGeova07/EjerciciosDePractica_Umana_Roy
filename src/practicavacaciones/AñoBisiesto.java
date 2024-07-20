/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Escribe un programa que determine si un año es bisiesto o no
el proceso termina cuando se ingresa un 0
*/

/**
 *
 * @author royum
 */
public class AñoBisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        int año;
        
        do{
            System.out.println("Ingrese un año: ");
            año = lea.nextInt();
            
            // si es anio es diferente de 0 se ejecuta la verificacion 
            
            if(año !=0){
                // verificamos si el anio es bisiesto   
                if((año % 400 == 0) || (año % 4 == 0) && (año % 100 == 0)){
                    System.out.println("El año "+año+ " es bisiesto");
                } else {
                    System.out.println("El año "+año+ " no es bisiesto");
                }
            } else {
                System.out.println("Gracias por participar..");
            }
        } while(año !=0);
        
    }
    
}

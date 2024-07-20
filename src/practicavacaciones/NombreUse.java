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
public class NombreUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lea = new Scanner (System.in).useDelimiter("\n");
        
       
       String nombreCompleto;
       
        System.out.println("Ingrese nombre Completo: ");
        nombreCompleto = lea.next();
        
        System.out.println("Nombre: "+nombreCompleto);

        
    }
    
}

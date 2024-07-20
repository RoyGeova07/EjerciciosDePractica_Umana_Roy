/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Un empleado tiene un sueldo fijo, y va recibir un aumento de 15% de sueldo. Se necesita saber cuanto dinero 
representa el 15%
*/

/**
 *
 * @author royum
 */
public class EmpleadoPorcentaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        double sueldo, aumento = 0.15, montoaumento;
        
        System.out.println("Ingresar el sueldo del empleado: ");
        sueldo = lea.nextDouble();
        
        montoaumento = sueldo * aumento; 
        
        System.out.println("Sueldo Fijo: "+sueldo);
        System.out.println("Aumento del 15% : "+montoaumento);
        System.out.println("Sueldo Total: "+(sueldo + montoaumento) );
        
    }
    
}

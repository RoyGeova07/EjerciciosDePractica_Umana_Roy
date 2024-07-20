/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Elabore un algoritmo  que calcule el area y perimetro de un circulo dado por su teclado
*/

/**
 *
 * @author royum
 */
public class PerimetroRadioCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        double radio, area, perimetro;
        
        // pedimos datos
        System.out.println("Ingrese el radio: ");
        radio = lea.nextDouble();
        
        // hacemos la operacion
        
        area = 3.14 * (radio * radio);
        perimetro = 2 *3.14 * radio;
        
        System.out.println("El area de circulo es: "+area+ " cm.");
        System.out.println("El perimetro del circulo es: "+perimetro+ " cm.");
        
    }
    
}

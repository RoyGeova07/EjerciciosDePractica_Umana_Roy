/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
De una lista de 10 numeros calcular la media y determinar cuantos numeros son mayores que 10.5, cuantos son iguales y cuantos son menores 
*/

/**
 *
 * @author royum
 */
public class EjercicioArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int contadorMayores = 0, ContadorIguales = 0, ContadorMenores = 0;
        double suma = 0;
        
        double arreglonumero[] = new double [10];
        final double valor = 10.5;
        
        System.out.println("Ingrese numeros del arreglo: ");
        for(int dedo = 0; dedo < arreglonumero.length; dedo++){
            arreglonumero[dedo] = lea.nextDouble();
            
            // condiciones
            
            if(arreglonumero[dedo] > valor){
                //contadores
                contadorMayores++;
            } else if(arreglonumero[dedo] < valor ){
                ContadorMenores++;
            } else{
                ContadorIguales++;
            }
            suma += arreglonumero[dedo];
        }
        
        System.out.println("Contador mayor: "+contadorMayores);
        System.out.println("Contador Menor: "+ContadorMenores);
        System.out.println("Contador Igual: "+ContadorIguales );
        
        //mostramos la media
        
        System.out.println("Media de la lista: "+suma / arreglonumero.length);
        
        
        
        
    }
    
}

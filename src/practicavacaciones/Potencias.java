/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

/*
Mostrar las 10 primeras potencias de 3 y la suma de ellos 
*/

/**
 *
 * @author royum
 */
public class Potencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        double potencia ;
        
        for(int caca = 0; caca <= 10; caca++){
            potencia =  Math.pow(caca, 3);
            System.out.println(caca+ "^3 "+potencia);
            suma += potencia;
        }
        System.out.println("Suma: "+suma);
        
    }
    
}

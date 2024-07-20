/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

/*
Una empresa productora de lacteos exporta su total de produccion 
de la siguiente manera:
35% para Asia
27% para Europa
19% para America 
y el resto para Africa
haz un programa que determine cuanto exporta a cada lugar.
 */
import java.util.Scanner;
/**
 *
 * @author royum
 */
public class PracticaVacaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int ProduccionAsia;
        int ProduccionEuropa;
        int ProduccionAmericaLatina;
        int ProduccionAfrica;
        int TotalProduccion;

        System.out.println("Ingrese la cantidad de exportacion de lacteos: ");
        TotalProduccion = lea.nextInt();

        ProduccionAsia = (TotalProduccion / 100) * 35;
        ProduccionEuropa = (TotalProduccion / 100) * 27;
        ProduccionAmericaLatina = (TotalProduccion / 100) * 19;
        ProduccionAfrica = (TotalProduccion / 100) * 19;

        System.out.println("Produccion de Asia (35%): " + ProduccionAsia);
        System.out.println("Produccion de Europa (27%): " + ProduccionEuropa);
        System.out.println("Produccion de America Latina (19%): " + ProduccionAmericaLatina);
        System.out.println("Produccion de Africa (19%):  " + ProduccionAfrica);
    }
}
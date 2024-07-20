/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Escribe una aplicacion con un string que contenga un contrasena cualquiera. despues se te pedira que introduzcas
la contrasena  con 3 intentos. Cuando aciertes ya no pedira mas la contrasena y mostrara un mensaje diciendo
enhorabuena piensa bien  en la condicion  de salida (3 intentos y si cierta sal aunque le queda intentos).
 */
/**
 *
 * @author royum
 */
public class Contrasena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int intentos = 3;

        final String contrasena = "Roy312007";
        String contr;

        do {
            System.out.println("Ingresa la contraseña por favor: ");
            contr = lea.nextLine();
 
            if (!contr.equals(contrasena)) {
                intentos = intentos - 1;
                System.out.println("Mal esa no es la contrasena");
            } else {
                System.out.println("En hora buena "); 
            }
        } while ((!contr.equals(contrasena)) && (intentos != 0));

    }

}

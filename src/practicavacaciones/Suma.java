/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author royum
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String primernumero = JOptionPane.showInputDialog("Introduzca el primer numero entero: ");
        String segundonumero = JOptionPane.showInputDialog("Introduzca el segundo numero entero: ");
        
        
        int numero1 = Integer.parseInt( primernumero );
        int numero2 = Integer.parseInt(segundonumero);
        
        int suma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "La suma es:  "+suma);
        
        
    }
    
}

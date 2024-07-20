/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mini_Proyecto_6;

/**
 *
 * @author royum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje Heroe = new Personaje("Roy", 6, 2, 80);

        VentanaPrincipal juego = new VentanaPrincipal(Heroe);

        juego.ComenzarJuego();
    }

}
